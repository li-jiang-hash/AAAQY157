;window.onload = () =>{
    this.addCart= () =>{
        this.myCreateDocument = s => document.createElement(s)
        let inputs = document.getElementsByTagName("input")

        console.log(inputs)
        let td1= myCreateDocument("td")
        td1.innerHTML = inputs[1].value
        let td2= document.createElement("td")
        td2.innerHTML = inputs[2].value
        let td3= document.createElement("td")
        td3.innerHTML = inputs[3].value
        let td4= document.createElement("td")
        td4.innerHTML = inputs[2].value * inputs[3].value
        let td5= document.createElement("td")
        td5.innerHTML = "<a href='javascript:;' onclick='del(this)'>删除</a>"
        let tr= document.createElement("tr")
        tr.appendChild(td1)
        tr.appendChild(td2)
        tr.appendChild(td3)
        tr.appendChild(td4)
        tr.appendChild(td5)
        let table = document.getElementsByTagName('tbody')[0]
        table.appendChild(tr)
    }
    this.del = obj =>{
        // let tr = document.getElementsByTagName('tr')
        // tr.split(tr.length,1)
        obj.parentNode.parentNode.remove()
    }
}