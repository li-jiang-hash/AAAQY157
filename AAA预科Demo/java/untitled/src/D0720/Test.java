package D0720;

import java.time.LocalDate;
import java.time.Period;

public class Test {
    public static void main(String[] args) {
        Student stus[] = new Student[10];
        LocalDate stuBirthday1 = LocalDate.of(2003,7,11);
        LocalDate stuBirthday2 = LocalDate.of(2007,7,11);
        LocalDate stuBirthday3 = LocalDate.of(1992,7,11);
        LocalDate stuBirthday4 = LocalDate.of(2032,7,11);
        LocalDate stuBirthday5 = LocalDate.of(2001,7,11);
        LocalDate stuBirthday6 = LocalDate.of(2013,7,11);
        LocalDate stuBirthday7 = LocalDate.of(2019,7,11);
        LocalDate stuBirthday8 = LocalDate.of(2020,2,14);
        LocalDate stuBirthday9 = LocalDate.of(2994,7,11);
        LocalDate stuBirthday10 = LocalDate.of(2010,7,11);
        stus[0] = new Student("2022157001","张三","男",Period.between(stuBirthday1, LocalDate.now()).getYears(),stuBirthday1);
        stus[1] = new Student("2022157002","我的年龄","男",Period.between(stuBirthday2, LocalDate.now()).getYears(),stuBirthday2);
        stus[2] = new Student("2022157003","李四","男",Period.between(stuBirthday3, LocalDate.now()).getYears(),stuBirthday3);
        stus[3] = new Student("2022157004","李四","男",Period.between(stuBirthday4, LocalDate.now()).getYears(),stuBirthday4);
        stus[4] = new Student("2022157005","李四","男",Period.between(stuBirthday5, LocalDate.now()).getYears(),stuBirthday5);
        stus[5] = new Student("2022157006","李四","男",Period.between(stuBirthday6, LocalDate.now()).getYears(),stuBirthday6);
        stus[6] = new Student("2022157007","李四","男",Period.between(stuBirthday7, LocalDate.now()).getYears(),stuBirthday7);
        stus[7] = new Student("2022157008","李四","男",Period.between(stuBirthday8, LocalDate.now()).getYears(),stuBirthday8);
        stus[8] = new Student("2022157009","李四","男",Period.between(stuBirthday9, LocalDate.now()).getYears(),stuBirthday9);
        stus[9] = new Student("2022157010","李四","男",Period.between(stuBirthday10, LocalDate.now()).getYears(),stuBirthday10);
//          System.out.println(stu);

//        stus[1].setAge(32);
//        stus[3].setAge(-1);
        for (int i = 0; i < stus.length; i++) {
            if(stus[i].getAge()<0){
                stus[i].setAge(-1);
            }
        }
        Student temp;
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].birthday.isAfter(stus[j+1].birthday)){
                    temp=stus[j];
                    stus[j]=stus[j+1];
                    stus[j+1]=temp;
                }
            }
        }
        for(Student stu:stus) {
            System.out.println(stu);
        }


        int arr1[] = {10,8,19,2,3,4,7};
        int max= arr1[0];
        int min= arr1[0];
        for(int item:arr1) {
          if (item<min){
              min = item;
          }
        }
        for(int item:arr1) {
          if(item>max){
              max = item;
          }
        }
        System.out.println("最大值:"+max+"最小值:"+min);
    }
}
