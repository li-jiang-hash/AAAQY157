import java.util.Random;
import java.util.Scanner;

public class Day2Dome {
    public static void main(StringDemo[] args) {

//       金字塔
        Pyramid();
//      数字替换
//        FlipFlop();
//      鸡兔同笼
//        ChickenRabbit();
//      超市促销
//        Activity();
//      猜数字
//        RandomVal();
    }

    //金字塔
    public static void Pyramid(){
        int num = 7;
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j>0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
//    数字替换
    public static void FlipFlop(){
        for (int i = 1; i < 101; i++) {
            if(i%5==1){
                System.out.println();
            }
            if((i%5==0) && (i%3==0)){
                System.out.print("FlipFlop ");
            } else if (i%5==0) {
                System.out.print("Flop ");
            } else if (i%3==0) {
                System.out.print("Flip ");
            }else{
                System.out.print(i+" ");
            }

        }
    }
//    鸡兔同笼
    public static void ChickenRabbit(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i==0;){
            System.out.print("请输入总脚数：");
            int foot = sc.nextInt();
            System.out.print("请输入总头数：");
            int sum = sc.nextInt();
            if(foot%2==0){

//        int tu = 90 / 2 -30;
//        int j = 30-tu;
//        System.out.println(tu+" "+j);
                for (int chicken = 0; chicken <= foot; chicken++) {
                    int rabbit = sum - chicken; //兔
                    if (rabbit * 4 + chicken * 2 == foot && rabbit>0&&chicken>0){
                        System.out.println(foot+"只脚，"+sum+"个头:");
                        System.out.println("兔子的只数:"+rabbit);
                        System.out.println("鸡子的只数:"+chicken);
                        i++;
                    }else{
                            System.out.println("未能计算出头和脚，请从新输入！");
                    }
                }
            }else {
                System.out.println("输入脚的数量不合法,\n请重新输入:");
            }

        }
    }
//    超市促销
    public static void Activity(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入消费金额:");
        int userEnterMoney = sc.nextInt();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1.满50元,加2元换购2L装百世可乐一瓶");
        System.out.println("2.满100元,加3元换购2L装可口可乐一瓶");
        System.out.println("3.满100元,加10元换购5公斤面粉一袋");
        System.out.println("4.满200元,加10元换购苏泊尔炒菜锅一个");
        System.out.println("5.满200元,加20元换购欧莱雅爽肤水一瓶");
        System.out.println("0.不换购");
        System.out.print("请选择:");
        int userEnterNum = sc.nextInt();
//        int userEnterNum = sc.nextInt();
        if(userEnterNum>=0||userEnterNum<=5){
////            判断
//            if(userEnterNum==1 || userEnterMoney>49){
//                if (userEnterMoney <49) {
//                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
//                    return;
//                }
//                System.out.println("本次消费总金额:"+userEnterMoney);
//                System.out.println("成功换购:2L装百世可乐一瓶");
//            }else if (userEnterNum==2 || userEnterMoney>99){
//                if (userEnterMoney <99) {
//                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
//                    return;
//                }
//                System.out.println("本次消费总金额:"+userEnterMoney);
//                System.out.println("成功换购:2L装可口可乐一瓶");
//            }else if (userEnterNum==3 || userEnterMoney>99){
//                if (userEnterMoney <99) {
//                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
//                    return;
//                }
//                System.out.println("本次消费总金额:"+userEnterMoney);
//                System.out.println("成功换购:5公斤面粉一袋");
//            }else if (userEnterNum==4 || userEnterMoney>199){
//                if (userEnterMoney <199) {
//                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
//                    return;
//                }
//                System.out.println("本次消费总金额:"+userEnterMoney);
//                System.out.println("成功换购:苏泊尔炒菜锅一个");
//            }else if (userEnterNum==5 || userEnterMoney>199){
//                if (userEnterMoney <199) {
//                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
//                    return;
//                }
//                System.out.println("本次消费总金额:"+userEnterMoney);
//                System.out.println("成功换购:欧莱雅爽肤水一瓶");
//            }
        }else {
            System.out.println("没看清数字？选择错误");
//            userEnterNum = sc.nextInt();
        }
    }
//    猜数字
    public static void RandomVal(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int ran = r.nextInt(101);
        System.out.println(ran);
        for (int i = 6; i >= 0; i--) {
            System.out.print("猜猜我是几(提示:我是0-100之间的一个整数):");
            int userEnter = sc.nextInt();
            if(userEnter > ran){
                System.out.println("猜大了！请输入一个较小的数！\t\t\t您还有"+i+"次猜测机会！");
            } else if (userEnter < ran) {
                System.out.println("猜小了！请输入一个较大的数！\t\t\t您还有"+i+"次猜测机会！");
            } else if (userEnter == ran) {
                System.out.println("恭喜您，猜数成功！谜底数字就是"+ran+"!");
                break;
            }
        }

        System.out.println("很遗憾您没有猜正确，游戏结束！");
    }
}
