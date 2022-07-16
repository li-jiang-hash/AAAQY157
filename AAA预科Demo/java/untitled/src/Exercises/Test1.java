package Exercises;

public class Test1 {
    public static void main(String[] args) {
        
    String str1 = "classsdome";
    String str2 = "123";
    LengthCalculation ls= new LengthCalculation();
//    1)
    System.out.println(ls.lengthOf(str1));
//    2)
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.substring(2,7));
        System.out.println(str2.valueOf(str2));
    }
    
}
