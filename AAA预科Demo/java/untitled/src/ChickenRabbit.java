import java.util.Scanner;

public class ChickenRabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总脚数：");
        int foot = sc.nextInt();
        System.out.println("请输入总头数：");
        int sum = sc.nextInt();
        if(foot%2==0){
          
//        int tu = 90 / 2 -30;
//        int j = 30-tu;
//        System.out.println(tu+" "+j);
            for (int chicken = 0; chicken <= foot; chicken++) {
                int rabbit = sum - chicken; //兔
                if (rabbit * 4 + chicken * 2 == foot){
                    System.out.println("兔子的只数:"+rabbit);
                    System.out.println("鸡子的只数:"+chicken);
                }
            }
        }else { 
            System.out.println("输入总头的数量不合法,\n请重新输入:");
            foot = sc.nextInt();
        }
    }
}
