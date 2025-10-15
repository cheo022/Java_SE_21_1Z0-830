package practice;

import java.util.Scanner;

public class Customer {
    private String firstName;
    private String lastName;

    public String getFullName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your first name");
        firstName = scanner.nextLine();
        System.out.println("input your last name");
        lastName = scanner.nextLine();

        return this.firstName +" "+ this.lastName;
    }
}
