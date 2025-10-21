package basicjava.array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        System.out.println("-------------------- Sorting double array --------------------");
        //Sorting double array
        double[] array1 = {2.3, 11.0, 4.6, -3.6, 0.8, 12};
        System.out.println("unsorted array: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted array: " + Arrays.toString(array1));

        System.out.println("-------------------- Sorting int array --------------------");
        //Sorting int array
        int[] array2 = {1, 3, -5, 10, 2, 15, 9};
        System.out.println("unsorted array: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted array: " + Arrays.toString(array2));

        System.out.println("-------------------- Sorting char array --------------------");
        //Sorting char array
        char[] array3 = {'F', 'B', 'b', 'H', 'c', 'A'};
        System.out.println("unsorted array: " + Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println("Sorted array: " + Arrays.toString(array3));

        System.out.println("-------------------- Sorting String array --------------------");
        //Sorting String array
        String[] array4 = {"Cat", "Dog", "Monkey", "Lion", "elephant", "Com"};
        System.out.println("unsorted array: " + Arrays.toString(array4));
        Arrays.sort(array4);
        System.out.println("Sorted array: " + Arrays.toString(array4));

        System.out.println("-------------------- Sorting String array2 --------------------");
        //Sorting String array
        // Numbers in a chain are ordered by digits, the first digit from 0 to 9, the second and other digits organized in the same way successively
        String[] array5 = {"3", "300", "20", "35", "37", "31", "4", "70", "ant", "Zebra"};
        System.out.println("unsorted array: " + Arrays.toString(array5));
        Arrays.sort(array5);
        System.out.println("Sorted array: " + Arrays.toString(array5));
        // 2 3 3 3 3 3 4 7 -> 20, 3, 300, 31, 35, 37, 4, 70
    }
}
