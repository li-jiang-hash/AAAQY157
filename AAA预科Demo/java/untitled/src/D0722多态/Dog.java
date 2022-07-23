package D0722多态;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void la() {
        System.out.println("狗拉尿");
    }
}
