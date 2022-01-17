package Arrays;
//Reverse Of an Array

import java.util.Arrays;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = ip.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++){
            arr[i] = ip.nextInt();
        }

        int[] reversedArray = revereArrays(arr);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    public static int[] revereArrays(int[] arr){
        int temp;
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
}
