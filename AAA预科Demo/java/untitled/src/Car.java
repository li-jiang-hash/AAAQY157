public class Car {
    String trademark;
    String color;
    int capacity;
    int speedLimit;
    public Car(String trademark, String color, int capacity, int speedLimit){
        this.trademark = trademark;
        this.color = color;
        this.capacity = capacity;
        this.speedLimit = speedLimit;
    }
    public void printCar(){
        System.out.println("商标:"+trademark);
        System.out.println("颜色:"+color);
        System.out.println("载重人数:"+capacity);
        System.out.println("最大时速:"+speedLimit+"Km/h");
    }

    String washName;
    public int washMoney,washTime,systemYear,systemMonth,systemDay,hour,minute,second;
    public void washing(){
        System.out.println("洗车店名:"+washName);
        System.out.println("日期:"+systemYear+"年"+systemMonth+"月"+systemDay+"日");
        System.out.println("时间:"+hour+"点"+minute+"分"+second+"秒");
        System.out.println("洗车花了"+washMoney+"快钱");
        System.out.println("洗车用掉"+washTime+"分钟");
    }
    public void filGas(int num){
        System.out.println(systemYear+"年"+systemMonth+"月"+systemDay+"日您的"+trademark+"加了"+num+"L汽油。");
    }

    public String marching(int v){
        String str1 ="不好意思，您超速了";
        String str2 ="正常行驶，没有超速";
        if(v>speedLimit){
            return str1;
        }else{
            return str2;
        }
    }
}
