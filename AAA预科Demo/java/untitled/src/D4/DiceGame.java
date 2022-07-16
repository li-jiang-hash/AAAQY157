package D4;

public class DiceGame {
    public static int dice1;
    public static int dice2;
    public boolean play(int num1,int num2){
        num1+=num2;
        return num1==7;
    }
}
