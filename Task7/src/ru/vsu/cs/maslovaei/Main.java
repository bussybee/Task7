package ru.vsu.cs.maslovaei;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        TestProgram testProgram = new TestProgram();

        if (!testProgram.tests()) {
            System.out.println("Test error");
            return;
        } else {
            System.out.println("All tests completed");
        }

        int[] array = new int[readLengthOfArray()];
        readArray(array);

        System.out.println("answer " + solution.findQuantityOfElements(array));
    }
    private static int readLengthOfArray(){
        System.out.println("Filling the array");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        return scanner.nextInt();
    }

    private static void readArray(int[] array){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.printf("Enter %d element of array: ", (i + 1));
            array[i] = scanner.nextInt();
        }
    }
}
