package arrayRotation;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = scanner.nextInt();
        System.out.println("Enter Elements into the Array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter number for Number of Rotation");
        int numberOfRotation = scanner.nextInt();
        scanner.close();
        ArrayRotation arrayrotation = new ArrayRotation();
        arrayrotation.reverse(array, 0, size - 1, size);
        arrayrotation.reverse(array, 0, numberOfRotation - 1, size);
        arrayrotation.reverse(array, numberOfRotation, size - 1, size);
        arrayrotation.printArray(array);

    }

    public void reverse(int array[], int start, int end, int size) {
        int temporary;
        while (start < end) {
            temporary = array[start];
            array[start] = array[end];
            array[end] = temporary;
            start++;
            end--;

        }
    }

    public void printArray(int array[]) {
        for (int iterator = 0; iterator < array.length; iterator++) {
            System.out.print(array[iterator] + " ");
        }
    }

}