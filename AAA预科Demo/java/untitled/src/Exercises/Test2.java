package Exercises;

public class Test2 {
    public static void main(String[] args) {
        String str3 = "function";
        String str4 = "我爱你中国";
        LengthCalculation lc=new LengthCalculation();
//        1)
        System.out.println("第一个字符串长度"+lc.lengthOf(str3));
        System.out.println("第二个字符串长度"+lc.lengthOf(str4));
//        2)
        String s1 = str3.substring(1,3);
        String s2 = str4.substring(1,3);
        System.out.println(s1);
        System.out.println(s2);
//        3)
        lc.ifEquals(s1,s2);

    }
}
