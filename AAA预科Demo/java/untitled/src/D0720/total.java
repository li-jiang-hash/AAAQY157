package D0720;

public class total {
    public static void main(String[] args) {
        System.out.println("最小值的下标为:"+getMin());
    }
    public static int getMin(){

        int arr1[]={18,25,7,36,13,2,89,63};
        int min = arr1[0];
        int minIndex=0;
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]<min){
                min = arr1[i];
            }
            if(arr1[i]==min){
                minIndex = i;
            }
        }
        System.out.println("最小值为:"+min);
        return minIndex;
    }
}
