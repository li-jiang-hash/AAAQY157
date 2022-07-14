public class FlipFlop {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if(i%5==1){
                System.out.println();
            }
            if((i%5==0) && (i%3==0)){
                System.out.print("FlipFlop ");
            } else if (i%5==0) {
                System.out.print("Flop ");
            } else if (i%3==0) {
                System.out.print("Flip ");
            }else{
                System.out.print(i+" ");
            }

        }
    }
}
