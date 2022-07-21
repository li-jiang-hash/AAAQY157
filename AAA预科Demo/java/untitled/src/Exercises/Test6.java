package Exercises;

public class Test6 {
    public static void main(String[] args) {
//        动态
        int arr[] = new int[5];
        int [] arr2 = new int[5];
//        静态
        int arr3[] = new int[]{1,2,3,4,5};
        int arr4[] ={1,2,3,4,5};

        for (Integer i : arr3) {
            System.out.println(i);
        }
        for(int i:arr3) {
          System.out.println(i);
        }
    }
}
