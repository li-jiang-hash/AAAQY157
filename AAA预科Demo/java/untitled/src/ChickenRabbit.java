import java.util.Scanner;

public class ChickenRabbit {
    public static void main(StringDemo[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i==0;){
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
                    if (rabbit * 4 + chicken * 2 == foot && rabbit>0&&chicken>0){
                        System.out.println(foot+"只脚，"+sum+"个头:");
                        System.out.println("兔子的只数:"+rabbit);
                        System.out.println("鸡子的只数:"+chicken);
                        i++;
                    }else{
                        int j = 0;
                        if (j==1){
                            System.out.println("未能计算出头和脚，请从新输入！");
                        }
                        j++;
                    }
                }
            }else {
                System.out.println("输入脚的数量不合法,\n请重新输入:");
            }

        }
    }
}
