window.onload = () => {
   this.$ = selector => document.querySelector(selector)
   this.$all = selector => document.querySelectorAll(selector)
   this.AllGoods=(goodsNum,a)=>{
      let allGoods = $all(".as")
      console.log(allGoods)
      switch (a){
         case '+':
            $('#goodsAllNum').innerHTML = Number($('#goodsAllNum').innerHTML) +Number(goodsNum)
            break
         case '-':
            $('#goodsAllNum').innerHTML = Number($('#goodsAllNum').innerHTML) -Number(goodsNum)
            break
         default:
            console.log("请检查计件的件数？")
      }
         console.log(goodsNum)
   }
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
         let table = $("tbody")
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
            num = obj.previousElementSibling.value
            num++
            obj.previousElementSibling.value = num
            AllGoods(1,"+")
            break;
         case '-':
            num = obj.nextElementSibling.value
            num--
            num < 1 ? num = 1 : num
            obj.nextElementSibling.value = num
            break;
         default:
            console.log("请检查运算符")
      }
      let price = obj.parentNode.previousElementSibling.innerHTML
      obj.parentNode.nextElementSibling.innerHTML = price * num
      getTotal()
   }
   //操作-单个删除
   this.del = obj => obj.parentNode.parentNode.remove() || getTotal() || AllGoods(obj.parentNode.parentNode.cells[3].childNodes[3].value, '-')


   //全选
   this.checkAll = () => {
      let goodsArr = $all(".goods")
      let checkAll = $("#checkAll")
      for (let i in goodsArr) goodsArr[i].checked = checkAll.checked
      getTotal()
   }
   this.clearAll = () => {
      let goodsArr = $all(".goods")
      let checkAll = $("#checkAll")
      let falg = true
      for (let i = 0; i < goodsArr.length; i++)
         if (!goodsArr[i].checked) falg = false
      checkAll.checked = falg
      getTotal()
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
         if (goodsArr[i].checked) goodsArr[i].parentNode.parentNode.remove()
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
         if (goodsArr[i].checked) sum += Number(goodsArr[i].parentNode.parentNode.cells[4].innerHTML)
      }
      $("#total").innerHTML = sum.toFixed(2)
   }
}