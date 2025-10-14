package basic_java.output;

public class BasicOutput {
    public static void main(String[] args) {
        System.out.println("Java programming is fun");
        System.out.println("Java programming" + " is fun");

        System.out.println("Java ");
        System.out.println("programming");
        System.out.println("is");
        System.out.println("fun");

        int a = 4;
        int b = 6;
        int c = a + b;
        System.out.printf("%d + %d = %d", a, b, c);

        System.out.printf("%S", "hello ");
        System.out.print("WORD");
    }
}
