package basicjava.operator;

public class UnaryOperator {
    public static void main(String[] args) {
        double number = 7.6;
        boolean isCheck = true;

        System.out.println("number: " + +number);
        System.out.println("number: " + -number);
        System.out.println("number: " + ++number);
        System.out.println("number: " + --number);
        System.out.println("number: " + !isCheck);

        System.out.println("-----------------------------");

        double result = 4.7;
        System.out.println("result = " + result);
        System.out.println("result++ = " + result++);
        System.out.println("result = " + result);
        System.out.println("++result = " + ++result);
        System.out.println("result = " + result);
    }
}
