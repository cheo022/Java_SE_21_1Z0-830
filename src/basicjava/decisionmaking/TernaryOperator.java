package basicjava.decisionmaking;

public class TernaryOperator {
    public static void main(String[] args) {
        int score = 80;
        String result;
//        if (score > 50) {
//            result = "You pass the exam";
//        } else {
//            result = "You failed the exam";
//        }
        result = score > 50 ? "You pass the exam" : "You failed the exam";

        int a = 10, b = 9;
        int c = a == b ? a++ : b++;

        System.out.println("a : " + a); // 10
        System.out.println("b : " + b); // 8
        System.out.println("c : " + c); // 9
    }
}
