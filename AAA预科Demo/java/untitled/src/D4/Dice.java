package D4;

import java.util.Random;

public class Dice {
    public static int faceValue;
    public void roll(){
//        Random ra = new Random();

        Random r = new Random();

        int ran = r.nextInt(6)+1;
//        int a = (int)(Math.random()*6)+1;
        faceValue = ran;
    }
    public int getFaceValue(){
        return faceValue;
    }
}
