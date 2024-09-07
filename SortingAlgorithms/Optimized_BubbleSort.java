package SortingAlgorithms;
/*This is an optimized version of bubble sort
 * This version of code includes a flag (swapped) that helps 
 * terminate the sorting process early if the array 
 * becomes sorted before completing all the passes, 
 * thereby improving efficiency in the best-case scenario.
 */



import java.util.Scanner;

public class Optimized_BubbleSort {

    // Optimized function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;  // Flag to check if a swap occurred in the current pass

        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Initialize swapped as false for each pass
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  // Set swapped to true since a swap occurred
                }
            }

            // If no swap occurred during the pass, the array is already sorted
            if (!swapped) {
                break;  // Break the loop as the array is sorted
            }
        }
    }

    // Function to take input from the user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();  // Size of array

        int[] arr = new int[n];  // Create an array of size 'n'
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();  // Taking array elements as input
        }

        // Close the scanner
        scanner.close();

        return arr;
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Take input from the user
        int[] arr = takeInput();

        // Sort the array using the optimized bubble sort
        bubbleSort(arr);

        // Print the sorted array
        printArray(arr);
    }
}
