package quiz.quiz16to17;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");

        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}