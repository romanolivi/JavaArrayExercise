package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedIntegers = new int[array.length];
        for(int i=0; i<array.length; i++) {
            sortedIntegers[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i< sortedIntegers.length-1; i++) {
                if(sortedIntegers[i] < sortedIntegers[i+1]) {
                    temp = sortedIntegers[i];
                    sortedIntegers[i] = sortedIntegers[i+1];
                    sortedIntegers[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedIntegers;
    }

}

























