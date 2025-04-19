package Arrays;
import java.util.*;

class arrayCC {
    static int largestValue(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    static int smallestValue(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        int arr[] = { 2, 8, 10, 12, 24, 23, 12, 32, 13, 14 };

        System.out.println("Largest value " + largestValue(arr));
        System.out.println("Smallest value " + smallestValue(arr));
    }
}