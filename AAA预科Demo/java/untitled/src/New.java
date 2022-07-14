import java.util.Scanner;

public class New {


    public static void main(String[] args) {
        final String b= "Hello,Wold";

        int a=120;
        char c = (char) a;
        double d=2,e=2;
        for (int i = 1; i < 100; i++) {
            d*=e;
        }
        System.out.println(b+c);
        System.out.println(d);

        short f=1;
        f+=1;
        System.out.println(f);


        Scanner sc=new Scanner(System.in);
        System.out.println("第一个数字:");
        int num1 = sc.nextInt();
        System.out.println("第二个数字:");
        int num2 = sc.nextInt();
        int maxValue = num1>num2 ? num1 : num2;
        System.out.println(maxValue);
        System.err.println("出错了");
        System.out.println("maxValue = " + maxValue);
    }
}
