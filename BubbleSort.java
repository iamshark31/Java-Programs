/*This is a code to sort the elements in an array using Bubble sort 
 * This is the simplest implementation of Bubble Sort, 
 * where every element is compared with its adjacent element, 
 * and no optimization is applied. 
 * The algorithm will always perform n-1 passes, 
 * even if the array is already sorted, 
 * leading to the worst time complexity of O(n²)
*/
import java.util.Scanner;

public class BubbleSort {
    
    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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

        // Sort the array using bubble sort
        bubbleSort(arr);

        // Print the sorted array
        printArray(arr);

    }
}
