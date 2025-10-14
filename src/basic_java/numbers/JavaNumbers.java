package basic_java.numbers;

public class JavaNumbers {
    public static void main(String[] args) {
        //octal
        int octalNumber1 = 015;// this  will be started as 13 in decimal
        int octalNumber2 = 0104;
        int sumOctalNumber = octalNumber1 + octalNumber2;

        System.out.println("octalNumber1 in decimal " + octalNumber1);
        System.out.println("octalNumber2 in decimal " + octalNumber2);
        System.out.println("result in decimal " + sumOctalNumber);
        System.out.println("result as octal " + Integer.toOctalString(sumOctalNumber));

        System.out.println();
        System.out.println("--------------- Hexadecimal numbers --------------");
        //Hexadecimal
        int hexNumber1 = 0x180;//432 in decimal
        int hexNumber2 = 0x2F;//0-9 A-F 47 in decimal

        int sumHexNumber = hexNumber1 + hexNumber2; //479 in decimal


        System.out.println("hexNumber1 in decimal " + hexNumber1);
        System.out.println("hexNumber2 in decimal " + hexNumber2);
        System.out.println("result in decimal " + sumHexNumber);
        System.out.println("result as hexadecimal " + Integer.toHexString(sumHexNumber));

        System.out.println();
        System.out.println("--------------- Binary numbers --------------");

        int binaryNumber1 = 0b1001;// 9 in decimal
        int binaryNumber2 = 0b1011;// 11 in decimal
        int sumBinaryNumber = binaryNumber1 + binaryNumber2;

        System.out.println("binaryNumber1 in decimal " + binaryNumber1);
        System.out.println("binaryNumber2 in decimal " + binaryNumber2);
        System.out.println("result in decimal " + sumBinaryNumber);
        System.out.println("result as hexadecimal " + Integer.toBinaryString(sumBinaryNumber));


    }
}
