package basicjava.datatype;

public class CharExample {
    public static void main(String[] args) {

        //Char Data Type -> 0-65535 'A'
        char c1 = 'H'; // 72 in decimal
        char c2 = '5'; // 53 in decimal

        System.out.println("c1: " + c1);
        System.out.println("is first variable letter? " + Character.isLetter(c1));
        System.out.println("is first variable digit? " + Character.isDigit(c1));

        System.out.println("c2: " + c2);
        System.out.println("is second variable letter? " + Character.isLetter(c2));
        System.out.println("is second variable digit? " + Character.isDigit(c2));

        char letter = 67; // C
        int num1 = letter + 3; // 67 + 3 = 770 -> F in ASCII
        char letter2 = (char) num1; // F

        System.out.println("letter2 is: " + letter2); // Output is F

        char letter3 = 70; // F in ASCII
        char letter4 = letter3--; // letter4 = 70, after this letter is 69 -> E

        boolean check1 = letter4 == 'E'; // F != E -> check1 = false
        boolean check2 = letter3 > 'D'; // E(69) > D(68) -> true
        boolean check3 = --letter3 > 'D'; // D(68) > D(68) -> false

        System.out.println("check1 : " + check1);
        System.out.println("check2 : " + check2);
        System.out.println("check3 : " + check3);

    }
}
