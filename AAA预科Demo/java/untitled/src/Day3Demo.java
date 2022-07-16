import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Day3Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        菲薄
//        System.out.println(Solution(200));

//        Student stu = new Student();
//        stu.stuId="20220711";
//        stu.stuName="李江";
//        stu.stuSex="男";
//        stu.stuAge=20;
//        stu.stuWeight=72;
//        stu.stuHeight=1800;
//        stu.student();
//        System.out.println(stu.info(1)+stu.info());
//        stu.study("JavaScript",9);
//        System.out.println(stu.work(8,12.12));


//        1.车辆
        Car c = new Car("宝马","blue",5,220);
        c.printCar();
//        2)

        
//        System.out.println(hour+"-"+minute+"-"+second);

        System.out.print("请输入洗车店名:");
        String washName = sc.next();
        System.out.print("洗车花了多少钱:");
        int washMoney = sc.nextInt();
        System.out.print("洗车用时:");
        int washTime = sc.nextInt();


        SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
        Calendar ca = Calendar.getInstance();
        int year = ca.get(Calendar.YEAR);
        int month = ca.get(Calendar.MONTH);
        int day = ca.get(Calendar.DAY_OF_MONTH);
        int hour = ca.get(Calendar.HOUR_OF_DAY);
        int minute = ca.get(Calendar.MINUTE);
        int second = ca.get(Calendar.SECOND);

        c.washName = washName;
        c.washMoney = washMoney;
        c.washTime = washTime;
        c.systemYear = year;
        c.systemDay = day;
        c.systemMonth = month;
        c.hour = hour;
        c.minute = minute;
        c.second = second;
        c.washing();
        System.out.print("加油站，您加了多少油:");
        int val = sc.nextInt();
        c.filGas(val);

        System.out.print("您的车速是:");
        System.out.println(c.marching(sc.nextInt()));

//        2.募捐
//        Foundation foun = new Foundation();
//        System.out.print("请输入募捐金额:");
//        foun.addFund(sc.nextDouble());
//        3.


    }
    public static int Solution(int n) {
        int[] res = {0, 1};
        if(n<2){
            return res[n];
        }
        int first = 0;
        int second = 1;
        int fibn = 0;
        for (int i = 2; i <= n; i++) {
            fibn = first+second;
            first = second;
            second = fibn;
        }
        return  fibn;
    }
}
