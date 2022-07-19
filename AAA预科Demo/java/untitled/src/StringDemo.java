public class StringDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str ="";
        for (int i=0;i<=100000;i++){
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end=start);
        StringBuffer sb = new StringBuffer();

    }
}
