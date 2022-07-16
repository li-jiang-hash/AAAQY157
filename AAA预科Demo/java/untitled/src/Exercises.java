public class Exercises {
    public static void main(String[] args) {

        int a=0,c=0;
        do{
            --c;
            a=a-1;
        }while(a>0);
        System.out.println(c);
        int j =8,k=15;
        for (int i = 2; i!=j;i++) {
            j-=2;
            k++;
        }
        System.out.println("k"+k);

    }
}
