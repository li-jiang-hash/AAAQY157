public class Student {
    String stuId;
    String stuName;
    String stuSex;
    int stuAge;
    double stuHeight;
    double stuWeight;
    public void student(){
        System.out.println("学生学号:"+stuId);
        System.out.println("学生姓名:"+stuName);
        System.out.println("学生性别:"+stuSex);
        System.out.println("学生年龄:"+stuAge+"虚岁");
        System.out.println("学生身高:"+stuHeight+"mm");
        System.out.println("学生体重:"+stuWeight+"KG");
    }
    public String info(){
        return stuName+stuSex+stuId;
    }
    public int info(int i){
        return stuAge+i;
    }
    public void study(StringDemo subject, int hour){
        System.out.println(stuName+"每天学习"+subject+"课程"+hour+"小时");
    }
    public double work(double hour,double money){
        return hour*money*1.000;
    }
}
