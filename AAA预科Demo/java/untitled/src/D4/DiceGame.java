package D4;

public class DiceGame {
    public int dice1;
    public int dice2;
    public boolean play(int num1,int num2){
        num1+=num2;
        return num1==7;
    }
}
