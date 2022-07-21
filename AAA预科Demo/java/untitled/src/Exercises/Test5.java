package Exercises;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Student sd = new Student(2217,"李江","男");
        sd.printInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的身份证号:");
        String ID = sc.next();
        System.out.println("学生"+sd.stuName+sd.getAge(ID)+"岁");
    }

}
