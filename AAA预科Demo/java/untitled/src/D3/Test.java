package D3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Calculator ca = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个数字:");
        int num2 = sc.nextInt();
        ca.num1=num1;
        ca.num2=num2;
        ca.add();
        ca.subtraction();
        ca.multiplication();
//        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        switch (str){
            case "+": ca.add();
                break;
        }

    }
}
