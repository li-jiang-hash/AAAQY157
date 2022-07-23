package D0722多态;

public class Test {
    public static void main(String[] args) {
        Father f = new Son();
        Object o = new Object();
        System.out.println(f instanceof Object);
        if (f instanceof Father){
            System.out.println(o instanceof Father);
        }
    }
}
