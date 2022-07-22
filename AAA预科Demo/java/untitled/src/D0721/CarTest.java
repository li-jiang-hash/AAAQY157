package D0721;

public class CarTest {
    public static void main(String[] args) {
        Drive d = new Drive();;
        d.drive(new Bus());
        d.drive(new Car());
        d.drive(new MaxCar());
    }
}
