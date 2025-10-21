package basicjava.array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] numberArray; // Declaration

        // Instantiation and initialization
        // The number array is an int array
        // It can hold 5 element
        // Its length is 5
        numberArray = new int[5];

        numberArray[0] = 5;
        numberArray[1] = -4;
        numberArray[2] = 7;
        numberArray[3] = 2;
        numberArray[4] = -3;
        //numberArray[5] = 6;

        int result = numberArray[0] + numberArray[1] + numberArray[2] + numberArray[3] + numberArray[4];
        System.out.println("Result: " + result);
        System.out.println("numberArray " + Arrays.toString(numberArray));
        System.out.println("Length to the array " + numberArray.length);

        int[] numberArray2 = {5, -4, 7, -3, 2};
        System.out.println("numberArray2 before change " + Arrays.toString(numberArray2));
        numberArray2[3] = 8;
        System.out.println("numberArray2 after change " + Arrays.toString(numberArray2));
        //numberArray2.length = 8; // it's not possible

        int ages[] = new int[]{15, (int) 16.5, 17};
        System.out.println("ages " + Arrays.toString(ages));

        // Object is a superclass in java, it's possible create mixed array
        Object[] mixedArray = {3, 5, 7, 5.5F, "Cat", "H", false};
        System.out.println("mixedArray: " + Arrays.toString(mixedArray));

    }
}
