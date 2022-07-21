package Exercises;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    int stuNo;
    String stuName;
    String sex;
    public Student(int stuNo, String stuName, String sex){
        this.stuNo =stuNo;
        this.stuName= stuName;
        this.sex=sex;
    }
    public void printInfo(){
        System.out.println("学生学号:"+stuNo);
        System.out.println("学生姓名:"+stuName);
        System.out.println("学生性别:"+sex);
    }
    public int getAge(String IDCard){
//        int a = Integer.valueOf(IDCard.substring(6,10));
//        Calendar ca = Calendar.getInstance();
//        int year = ca.get(Calendar.YEAR);
//        LocalDate ld = LocalDate.of
//        return year - a;
//        System.out.println(year);
        String year = IDCard.substring(6,10);
        String month = IDCard.substring(10,12);
        String date = IDCard.substring(12,14);
        LocalDate d1 = LocalDate.now();
        LocalDate d = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(date));

        int per = Period.between(d, d1).getYears();
        return per;
    }
}
