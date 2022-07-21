package D0720;

import java.time.LocalDate;

public class Student {
    private String stuNo;
    private String stuName;
    private String sex;
    private int age;
    public LocalDate birthday;

    public Student(String stuNo, String stuName, String sex,int age, LocalDate birthday) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
