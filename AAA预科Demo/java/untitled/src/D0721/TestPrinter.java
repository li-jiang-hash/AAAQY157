package D0721;

public class TestPrinter {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.makeBook(new BlackPrinter());
        e.makeBook(new ColorPrinter());
        e.makeBook(new PhotoPrinter());
    }
}
