import json
import time
from pymongo.database import Database
from pymongo.collection import Collection
import pymongo
from lxml import etree
from selenium import webdriver


def get_html(url):
    browser = webdriver.Chrome()
    browser.get(url)
    if browser.current_url == url:
        js = "var q=document.documentElement.scrollTop=100000"
        browser.execute_script(js)
        time.sleep(2)
        responses = browser.page_source
        browser.close()
        return responses
    else:
        with open('cookies.txt', 'r', encoding='utf8') as f:
            listCookies = json.loads(f.read())
        for cookie in listCookies:
            cookie_dict = {
                'domain': '.jd.com',
                'name': cookie.get('name'),
                'value': cookie.get('value'),
                "expires": '1629446549',
                'path': '/',
'httpOnly': False,
                'HostOnly': False,
                'Secure': False
            }
            browser.add_cookie(cookie_dict)
        time.sleep(1)
        browser.get(url)
        js = "var q=document.documentElement.scrollTop=100000"
        browser.execute_script(js)
        time.sleep(2)
        responses = browser.page_source
        browser.close()
        return responses


def parser(responses):
    res = etree.HTML(responses)
    li_list = res.xpath('//*[@id="J_goodsList"]/ul/li')
    info = []
    for li in li_list:
        title = li.xpath('./div/div[4]/a/em//font/text()')[0]
        all_title = li.xpath('./div/div[4]/a/em/text()')
        all_title = title + process_list(all_title)
        price = li.xpath('./div/div[3]/strong/i/text()')[0]
        shop = li.xpath('./div/div[7]/span/a/text()')
        comment_num = li.xpath('./div/div[5]/strong/a/text()')
        discount = li.xpath('./div/div[8]/i/text()')
        print(all_title, price, shop, comment_num, discount)
        a = {'title': all_title, 'price': price, 'shop': shop, 'comment_num': comment_num, 'discount': discount}
        info.append(a)


def save_info_to_mongo(info):
    client = pymongo.MongoClient('localhost', 27017)
    collection = Collection(Database(client, 'Jingdong'), '魅族17')
    for info in info:
        collection.insert_one(info)
    client.close()


def process_list(lists):
    a = ''
    for i in lists:
        b = i.replace('\n', '').replace('【', '').replace('】', '').replace('-', '')
        a += b
    return a


if __name__ == '__main__':
    base_url = 'https://search.jd.com/Search?keyword=%E9%AD%85%E6%97%8F17&enc=utf-8&pvid=80b8781f5a604d3c917ae52204d45058'
    url_list = [base_url.format(i) for i in range(1, 20, 2)]
    for page_url in url_list:
        save_info_to_mongo(parser(get_html(page_url)))