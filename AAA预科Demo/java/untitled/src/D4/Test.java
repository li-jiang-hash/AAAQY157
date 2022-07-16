package D4;

import java.util.Scanner;
import java.util.Objects;
public class Test {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();
        Dice di = new Dice();
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i ==0;) {
            System.out.print("开始投掷？(y/n):");
            String str = sc.next();
            if(Objects.equals(str,"y")){
                di.roll();
                int num1 = di.getFaceValue();
                System.out.println("骰子1掷出了:"+num1);
                di.roll();
                int num2 = di.getFaceValue();
                System.out.println("骰子2掷出了:"+num2);
                if(dg.play(num1,num2)){
                    System.out.println("骰子总和掷出了7，您赢了！");
                }else{
                    System.out.println("很遗憾，您输了！");
                }
            }
            if(Objects.equals(str,"n")) {
                System.out.println("您选择了退出，退出游戏………………");
                i++;
            }
        }
    }
}
