package Exercises;

import java.nio.charset.StandardCharsets;

public class LengthCalculation {
    public int lengthOf(String str){
        if(str == null) return 0;
        StringBuffer buff = new StringBuffer(str);
        int length = 0;
        String stmp;
        for (int i = 0; i < buff.length(); i++) {
            stmp = buff.substring(i,i+1);
            try {
                stmp = new String(stmp.getBytes(StandardCharsets.UTF_8));
            }catch (Exception e){
                e.printStackTrace();
            }
            if (stmp.getBytes().length>1){
                length +=2;
            }else {
                length +=1;
            }
        }
        return length;
    }
    public void ifEquals(String s1,String s2){
        if(s1.equals(s2)){
            System.out.println("字符串1与字符串2内容相等");
        }else {
            System.out.println("字符串1与字符串2内容不相等");
        }
    }
}
