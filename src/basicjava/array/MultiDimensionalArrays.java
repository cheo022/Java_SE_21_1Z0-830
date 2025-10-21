package basicjava.array;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        // 2 Dimensional Array
        int[][] twoDimArray = new int[3][3]; //3 1D Array, size of each array is 3
        twoDimArray[0][0] = 0;
        twoDimArray[0][1] = 1;
        twoDimArray[0][2] = 2;
        twoDimArray[1][0] = 3;
        twoDimArray[1][1] = 4;
        twoDimArray[1][2] = 5;
        twoDimArray[2][0] = 6;
        twoDimArray[2][1] = 7;
        twoDimArray[2][2] = 8;

        System.out.println("Two Dimensional Array: " + Arrays.toString(twoDimArray));
        System.out.println(Arrays.toString(twoDimArray[0]));// print element of first 1 Dimensional Array
        System.out.println(Arrays.toString(twoDimArray[1]));// print element of second 1 Dimensional Array
        System.out.println(Arrays.toString(twoDimArray[2]));// print element of third 1 Dimensional Array

        int[][] ages = {
                {5, 20},// First Array
                {25, 26, 27},// Second Array
                {30}// Third Array
        };


        System.out.println("Ages: " + Arrays.toString(ages));
        System.out.println(Arrays.toString(ages[0]));// print element of first 1 Dimensional Array
        System.out.println(Arrays.toString(ages[1]));// print element of second 1 Dimensional Array
        System.out.println(Arrays.toString(ages[2]));// print element of third 1 Dimensional Array

        // 3 Dimensional Array

        char[][][] threeDimArray = { // 3D Dimensional Array
                { // First 2D Array
                        {'a', 'b', 'c'}, // First 1D array in first 2D array
                        {'d', 'e'} // Second 1D array in first 2D array
                },
                { // Second 2D Array
                        {'f', 'g'},// First 1D array in second 2D array
                        {'h'},// Second 1D array in second 2D array
                        {'i', 'j', 'k', 'l'}// Third 1D array in second 2D array
                }
        };

        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray));
        System.out.println("First 2D array: " + Arrays.toString(threeDimArray[0]));
        System.out.println("Second 2D array: " + Arrays.toString(threeDimArray[1]));
        System.out.println("First 1D array in first 2D array: " + Arrays.toString(threeDimArray[0][0]));
        System.out.println("Second 1D array in first 2D array: " + Arrays.toString(threeDimArray[0][1]));
        System.out.println("First 1D array in second 2D array: " + Arrays.toString(threeDimArray[1][0]));
        System.out.println("Second 1D array in second 2D array: " + Arrays.toString(threeDimArray[1][1]));
        System.out.println("Third 1D array in second 2D array: " + Arrays.toString(threeDimArray[1][2]));

        // int [] age= new int[4] { 20, 25, 30, 35 } ; //This is a Error, This code dosen't compile
    }

}
