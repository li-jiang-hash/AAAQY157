import java.util.Scanner;

public class Activity {
    public static void main(StringDemo[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费金额:");
        int userEnterMoney = sc.nextInt();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1.满50元,加2元换购2L装百世可乐一瓶");
        System.out.println("2.满100元,加3元换购2L装可口可乐一瓶");
        System.out.println("3.满100元,加10元换购5公斤面粉一袋");
        System.out.println("4.满200元,加10元换购苏泊尔炒菜锅一个");
        System.out.println("5.满200元,加20元换购欧莱雅爽肤水一瓶");
        System.out.println("0.不换购");
        System.out.println("请选择:");
        int userEnterNum = sc.nextInt();
        if(userEnterNum>=0||userEnterNum<=5){
//            判断
            if(userEnterNum==1 || userEnterMoney>49){
                if (userEnterNum <49) {
                System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
                return;
                }
                System.out.println("本次消费总金额:"+userEnterMoney);
                System.out.println("成功换购:2L装百世可乐一瓶");
            }else if (userEnterNum==2 || userEnterMoney>99){
                if (userEnterMoney <99) {
                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
                    return;
                }
                System.out.println("本次消费总金额:"+userEnterMoney);
                System.out.println("成功换购:2L装可口可乐一瓶");
            }else if (userEnterNum==3 || userEnterMoney>99){
                if (userEnterMoney <99) {
                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
                    return;
                }
                System.out.println("本次消费总金额:"+userEnterMoney);
                System.out.println("成功换购:5公斤面粉一袋");
            }else if (userEnterNum==4 || userEnterMoney>199){
                if (userEnterMoney <199) {
                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
                    return;
                }
                System.out.println("本次消费总金额:"+userEnterMoney);
                System.out.println("成功换购:苏泊尔炒菜锅一个");
            }else if (userEnterNum==5 || userEnterMoney>199){
                if (userEnterMoney <199) {
                    System.out.println("换购失败:您的消费金额为"+userEnterMoney+"不满足换购条件");
                    return;
                }
                System.out.println("本次消费总金额:"+userEnterMoney);
                System.out.println("成功换购:欧莱雅爽肤水一瓶");
            }
        }else {
            System.out.println("没看清数字？选择错误");
//            userEnterNum = sc.nextInt();
        }

    }
}

