package D0721Second;

public class PrinterMaster {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.printer(new BlackPrinter());
        e.printer(new ColorPrinter());
        e.printer(new PhotoPrinter());
    }
}
