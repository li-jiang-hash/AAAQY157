package D0722多态;

public class TemplateTest {
    public static void main(String[] args) {
        LiJiang lj = new LiJiang();
        lj.write();

//        instanceof
        Object o = new Object();

        System.out.println(lj instanceof LiJiang);
    }
}
