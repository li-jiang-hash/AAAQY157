# 导入webdriver模块
from selenium import webdriver
# 导入By模块
from selenium.webdriver.common.by import By
# 导入WebDriverWait模块
from selenium.webdriver.support.ui import WebDriverWait
# 导入ActionChains模块
from selenium.webdriver import ActionChains
# 导入expected_conditions模块
from selenium.webdriver.support import expected_conditions as EC
import time  # 导入time模块
from bs4 import BeautifulSoup  # 导入BeautifulSoup模块
import pymongo  # 导入pymongo模块

# 初始化Google Chrome浏览器对象，并赋值给browser
browser = webdriver.Chrome()
# 初始化WebDriverWait对象，并赋值给wait
wait = WebDriverWait(browser, 10)
# 创建MongoClient类对象
myclient = pymongo.MongoClient(host='localhost', port=27017)
# 选择数据库，如果不存在则新建一个数据库
mydb = myclient['京东']


# 定义函数，参数为搜索关键字，实现搜索商品
def search(keywd):
    # 请求京东网登录页面，打开一个浏览器窗口
    browser.get('https://www.jd.com/?cu=true&utm_source=baidu-pinzhuan&utm_medium=cpc&utm_campaign=t_288551095_baidupinzhuan&utm_term=0f3d30c8dba7459bb52f2eb5eba8ac7d_0_2a8685270a6b4d3ca37f650a45a880a0')
    time.sleep(1)  # 休眠1s
    browser.maximize_window()  # 窗口最大化
    time.sleep(1)  # 休眠1s
    # 输入搜索关键字
    wait.until(EC.presence_of_element_located(
        (By.CSS_SELECTOR, '[clstag="h|keycount|head|search_c"]'))
    ).send_keys(keywd)
    # 单击搜索按钮
    wait.until(EC.presence_of_element_located(
        (By.CSS_SELECTOR, '[clstag="h|keycount|head|search_a"]'))
    ).click()
    time.sleep(2)  # 休眠2s


# 定义goods_parse函数
def goods_parse(collection):
    page_num = browser.find_element_by_css_selector(
        '.p-skip b').text
    for i in range(int(page_num) + 1):  # 循环
        # 下拉滚动条至窗口底部
        browser.execute_script(
            'window.scrollTo(0, document.body.scrollHeight)')
        time.sleep(3)  # 休眠3s
        # 初始化soup对象
        soup = BeautifulSoup(browser.page_source, 'lxml')
        # 获取商品列表
        goods_list = soup.select('#J_goodsList>ul>li')
        for goods in goods_list:  # 遍历商品列表
            # 获取商品名
            title = goods.select(
                '[class="p-name p-name-type-2"] a em'
            )[0].text.strip()
            # 获取店铺名
            shop = goods.select('.p-shop')[0].text.strip()
            # 获取商品价格
            price = goods.select(
                '.p-price strong')[0].text.strip()
