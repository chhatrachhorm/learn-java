package Utility;

public class PrintArray {
    public static void printArray(String message, int[] array){
        System.out.print(message + " ");
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

