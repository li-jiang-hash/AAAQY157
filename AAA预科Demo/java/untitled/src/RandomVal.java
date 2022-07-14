import java.util.Random;
import java.util.Scanner;

public class RandomVal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int ran = r.nextInt(101);
        System.out.println(ran);
        for (int i = 6; i >= 0; i--) {
            System.out.println("猜猜我是几(提示:我是0-100之间的一个整数):");
            int userEnter = sc.nextInt();
            if(userEnter > ran){
                System.out.println("猜大了！请输入一个较小的数！\t\t\t您还有"+i+"次猜测机会！");
            } else if (userEnter < ran) {
                System.out.println("猜小了！请输入一个较大的数！\t\t\t您还有"+i+"次猜测机会！");
            } else if (userEnter == ran) {
                System.out.println("恭喜您，猜数成功！谜底数字就是"+ran+"!");
                break;
            }
        }

        System.out.println("很遗憾您没有猜正确，游戏结束！");
    }
}
