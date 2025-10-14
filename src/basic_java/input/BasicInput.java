package basic_java.input;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("you entered: " + number);

        System.out.println("Please enter a word");
        String text = input.next();
        System.out.println("you entered: " + text);

        System.out.println("Please enter a text");
        text = input.nextLine();
        System.out.println("you entered: " + text);
        input.close();
    }
}
