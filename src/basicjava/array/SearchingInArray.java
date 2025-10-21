package basicjava.array;

import java.util.Arrays;

public class SearchingInArray {
    public static void main(String[] args) {
        int[] numbers = {0, 12, 4, 16, 18, 10}; // unsorted array -> output is unpredictable
        int indexOfEight = Arrays.binarySearch(numbers, 8);
        System.out.println("index of 8: " + indexOfEight);

        int indexOfSeven = Arrays.binarySearch(numbers, 7);
        System.out.println("index of 7: " + indexOfSeven);

        Arrays.sort(numbers);

        int indexOfFour = Arrays.binarySearch(numbers, 4);
        System.out.println("index of 4: " + indexOfFour);

        String[] animals = {"Cat", "Com", "Dog", "Elephant", "Lion", "Monkey"};
        int indexOfDog = Arrays.binarySearch(animals, "Dog");
        System.out.println("index of Dog: " + indexOfDog);

        int indexOfAnt = Arrays.binarySearch(animals, "Ant");
        System.out.println("index of Ant: " + indexOfAnt);

    }
}
