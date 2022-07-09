;window.onload = () => {
   this.$ = selector => document.querySelector(selector)
   this.$all = selector => document.querySelectorAll(selector)

   //当页面加载完以后，初始化一些商品数据供选购
   let goodsList=[
        {goodsId:1,goodsName:"VIVOX200",goodsPrice:1999.0},
        {goodsId:2,goodsName: "Iphone56",goodsPrice:7999.0},
        {goodsId:3,goodsName:"HUAWEIP200",goodsPrice:8999.0},
        {goodsId:4,goodsName:"HUAWEIMate40 pro",goodsPrice:6999.0}
   ]
   //让商品加载到商品列表中
   ;(function onLoadInit () {
      let templte2 = $("#templte2")
      goodsList.forEach(goods => {
         $("#goodsList").innerHTML += templte2.innerHTML
           .replace("goodsId", goods.goodsId)
           .replace("goodsName", goods.goodsName)
           .replace("goodsPrice", goods.goodsPrice)
      })
   })()
   //从商品列表添加购物车
   let cartArr = []
   this.AddGoodsFun = obj =>{
      let flag = true
      let goodsId = obj.parentNode.parentNode.cells[0].innerHTML
      let goodsName = obj.parentNode.parentNode.cells[1].innerHTML
      console.log(goodsName)
      let goodsPrice = Number(obj.parentNode.parentNode.cells[2].innerHTML)
      // let btn = obj.parentNode.parentNode.cells[3].innerHTML
      // let templte = $("#templte").innerHTML
      //   .replace("goodsName", goodsName)
      //   .replace("goodsPrice", goodsPrice)
      //   .replace("goodsNum",1)
      //   .replace("subTotal", goodsPrice * 1)
      // let table = $("#goods")
      // table.innerHTML += templte
      console.log('cartArr',cartArr.length)
      for(let i =0;i<cartArr.length;i++){
         let goods = cartArr[i]
         console.log('goods.goodsId',goods.goodsId)
         if(goods.goodsId== goodsId){
            goods.goodsNum++
            console.log('goodsNum',goodsNum)
            flag = false
            break;
         }
      }

      if(flag){
         let goods = new Object()
         goods.goodsId =goodsId
         goods.goodsName =goodsName
         goods.goodsPrice =goodsPrice
         goods.goodsNum = 1
         goods.subTotal = goodsPrice * 1
         cartArr.push(goods)
      }
      $('#goods').innerHTML = ''
         cartArr.forEach((goods)=>{
            let teplte = $('#templte').innerHTML
              .replace('goodsId',goods.goodsId)
              .replace('goodsName',goods.goodsName)
              .replace('goodsPrice',goods.goodsPrice)
              .replace('goodsNum',goods.goodsNum)
              .replace('subTotal',goods.subTotal)
            $('#goods').innerHTML += teplte
         })

   //   调用件数计算方法
      AllGoods(1,'+')
   }


   //件数计算
   this.AllGoods=(goodsNum,symbol)=>{
      let allGoods = $all(".as")
      console.log(allGoods)
      switch (symbol){
         case '+':
            $('#goodsAllNum').innerHTML = Number($('#goodsAllNum').innerHTML) +Number(goodsNum)
            break
         case '-':
            $('#goodsAllNum').innerHTML = Number($('#goodsAllNum').innerHTML) -Number(goodsNum)
            break
         default:
            console.log("请检查计件的件数操作符？")
      }
      // console.log(goodsNum)
   }

   //加入购物车
   this.addCard = () => {
      let goodsNameFlag = false
      let goodsPriceFlag = false
      let goodsNumFlag = false
      this.goodsName = $('#goodsName').value
      let goodsPrice = $('#goodsPrice').value
      this.goodsNum = $('#goodsNum').value
      console.log(goodsName, goodsPrice, goodsNum)
      if ($('#goodsName').value.length > 0 && $('#goodsName').value.length <= 10) {
         goodsNameFlag = true
      } else {
         return alert("请输入商品名且商品名称不得大于十位？")
      }
      if ($('#goodsPrice').value.length > 0) {
         goodsPriceFlag = true
      } else {
         return alert("请输入商品单价？")
      }
      if ($('#goodsNum').value.length > 0) {
         goodsNumFlag = true
      } else {
         return alert("请输入商品数量？")
      }
      if (goodsNumFlag && goodsPriceFlag && goodsNameFlag) {
         let templte = $("#templte").innerHTML
            .replace("goodsName", goodsName)
            .replace("goodsPrice", goodsPrice)
            .replace("goodsNum", goodsNum)
            .replace("subTotal", goodsPrice * goodsNum)
         let table = $("#goods")
         table.innerHTML += templte
         $('#goodsName').value = ''
         $('#goodsPrice').value = ''
         $('#goodsNum').value = ''

         //调用计算商品件数方法计算商品
         AllGoods(goodsNum, "+")
      }
   }

   //商品的操作+/-
   this.SetSubTotal = obj => {
      let opra = obj.innerHTML
      let num
      switch (opra) {
         case '+':
            num = obj.previousElementSibling.innerHTML
            num++
            obj.previousElementSibling.innerHTML = num
            AllGoods(1,"+")
            // goodsNumSelect(this,'+')
            break;
         case '-':
            num = obj.nextElementSibling.innerHTML
            num--
            num < 1 ? num = 1 : num && AllGoods(1,"-")
            obj.nextElementSibling.innerHTML = num
            // goodsNumSelect(this,'-')
            break;
         default:
            console.log("请检查运算符")
      }
      let price = obj.parentNode.previousElementSibling.innerHTML
      obj.parentNode.nextElementSibling.innerHTML = price * num
      getTotal()
   }
   //操作-单个删除
   this.del = obj =>{

      //干掉所在的tr
      obj.parentNode.parentNode.remove()
      //计算价格
      getTotal()

      AllGoods(obj.parentNode.parentNode.cells[3].childNodes[3].value, '-')

      if($all('.goods').length == 0){
         $("#checkAll").checked = false
      }

   }


   //全选
   this.checkAll = () => {
      let goodsArr = $all(".goods")
      let checkAll = $("#checkAll")
      for (let i in goodsArr) goodsArr[i].checked = checkAll.checked
      getTotal()
   }
   //取消全选                                                                                      ++++679/
   this.clearAll = a => {
      let goodsArr = $all(".goods")
      let checkAll = $("#checkAll")
      let falg = true
      for (let i = 0; i < goodsArr.length; i++) if (!goodsArr[i].checked) falg = false
      checkAll.checked = falg
      getTotal()
      // goodsNumSelect(a,'a')
   }
   //删除选中的
   this.delSelect = () => {
      let goodsArr = $all('.goods')
      // for (let i = 0; i < goodsArr.length; i++) {
      //    if (goodsArr[i].checked) {
      //       name[i] += $all('.cl')[i].innerHTML
      //       console.log('name', name)
      //    }
      //    this.SelectName = name.join(',')
      // }
      // if(name.length>1){
      //    i = confirm("确认要删除" + SelectName + "吗？")
      // }else{
      //    console.log("请选择要删除的商品")
      // }
      // if (i) {
      for (let i = 0; i < goodsArr.length; i++) {
         if (goodsArr[i].checked){

            $("#checkAll").checked = false
            goodsArr[i].parentNode.parentNode.remove()
            $("#selectGoodsNum").innerHTML = Number($("#selectGoodsNum").innerHTML) - Number(goodsArr[i].parentNode.parentNode.cells[3].childNodes[3].value)
            $("#goodsAllNum").innerHTML = Number($("#goodsAllNum").innerHTML) - Number(goodsArr[i].parentNode.parentNode.cells[3].childNodes[3].value)
            let goodsId = goodsArr[i].value
            for (var j = 0; j < cartArr.length; j++) {
               cartArr.splice(j,1)
               break
            }
         }
      }
      // }
      //调用价格运算方法
      getTotal()


   //   调用件数计算
      AllGoods()


   }
   //单价计算方法
   this.getTotal = () => {
      var sum = 0;
      //知道那个被选中，获取所有的商品，判断哪个被选中
      var goodsArr = $all(".goods")
      for (var i = 0; i < goodsArr.length; i++){
         //获取所有的商品
         if (goodsArr[i].checked){
            sum += Number(goodsArr[i].parentNode.parentNode.cells[4].innerHTML)

            // if (bool){
            //    $("#selectGoodsNum").innerHTML = Number($("#selectGoodsNum").innerHTML) + Number(goodsArr[i].parentNode.parentNode.cells[3].childNodes[3].innerHTML)
            //    console.log(Number($("#selectGoodsNum").innerHTML),Number(goodsArr[i].parentNode.parentNode.cells[3].childNodes[3].innerHTML))
            // }else{
            //    $("#selectGoodsNum").innerHTML = Number($("#selectGoodsNum").innerHTML) + 1
            //    console.log($("#selectGoodsNum").innerHTML)
            // }
         }else{
            $("#selectGoodsNum").innerHTML = 0
         }
      }
      $("#total").innerHTML = sum.toFixed(2)
      if(sum!=0) {
         $('.click-btn').style.backgroundColor = "#ff6700"
         // console.log($('.click-btn').style.backgroundColor)
      }else{
         $('.click-btn').style.backgroundColor = "#f5f5f5"
      }
   }


   this.goodsNumSelect = (obj1,V) =>{
      // if (bool){
      //    $("#selectGoodsNum").innerHTML = Number($("#selectGoodsNum").innerHTML) + Number(goodsArr[i].parentNode.parentNode.cells[3].childNodes[3].innerHTML)
      //    console.log(Number($("#selectGoodsNum").innerHTML),Number(goodsArr[i].parentNode.parentNode.cells[3].childNodes[3].innerHTML))
      // }else{
      //    $("#selectGoodsNum").innerHTML = Number($("#selectGoodsNum").innerHTML) + 1
      //    console.log($("#selectGoodsNum").innerHTML)
      // }
      if(V){

      }
      //选择视角的数量
      if (obj1) goodsNum = obj1.parentNode.parentNode.cells[3].childNodes[3].innerHTML
      console.log()
      switch (V){
         case  'a':
            $("#selectGoodsNum").innerHTML = Number(goodsNum) + Number($("#selectGoodsNum").innerHTML)
         case '+':
            $("#selectGoodsNum").innerHTML = 1 + Number($("#selectGoodsNum").innerHTML)
         case '-':
            $("#selectGoodsNum").innerHTML = -1 + Number($("#selectGoodsNum").innerHTML)
      }
   }

}