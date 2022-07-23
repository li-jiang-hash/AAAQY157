package D0722多态;

public class AinmalTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        c.eat();
        d.eat();
        c.la();
        d.la();
    }
}
