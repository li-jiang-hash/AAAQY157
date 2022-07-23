package D0722多态;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃喵粮");
    }

    @Override
    public void la() {
        System.out.println("猫拉猫粮");
    }
}
