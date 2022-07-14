import java.util.Scanner;

public class MinMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = -1,max=101,sum=0;
        for (int i = 1; i < 6; i++) {
            System.out.println("请输入第"+i+"个学生的成绩");
            int score = sc.nextInt();
            if(max>score){
                max =score;
            }
            if(min<score){
                min =score;
            }
            sum += score;
        }
        System.out.println("最大值:"+max+"最小值:"+min+"平均值:"+sum/5+"总成绩:"+sum);
    }
}
