/*Write a java program to insert an element at specified index. */

public class StudyArrayComplexity {

    // public static void insertAtIndex(int[] arr, int data, int index) {

    //     arr[arr.length - 1] = data;

    //     for(int i = arr.length - 1; i > index; i--) {

    //         int temp = arr[i - 1];
    //         arr[i - 1] = arr[i];
    //         arr[i] = temp;

    //     }
    // }

    public static void insertAtIndex(int[] arr, int data, int index) {
        // 1. O(n) WORK: Create the "hole" by shifting elements to the right.
        // We start from the last element (arr.length - 1) and shift down to the index.
        for (int i = arr.length - 1; i > index; i--) {
            // Shift: Move the element at i-1 to the position i.
            // This is a single copy operation per element.
            arr[i] = arr[i - 1]; 
        }

        // 2. O(1) WORK: Insert the data into the now-empty 'hole'.
        arr[index] = data;
    }

    // Helper main method for testing:
    public static void main(String[] args) {
        // The array has size 6, but only 5 elements are currently 'used'
        int[] numbers = {10, 20, 30, 40, 50, 0}; 
        int effectiveSize = 5; // The last slot is available

        System.out.println("Original array (effective size " + effectiveSize + "):");
        // Print only the 'used' elements
        for (int i = 0; i < effectiveSize; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Insert '99' at index 4
        insertAtIndex(numbers, 99, 4);
        
        System.out.println("\nArray after insertion (at index 3):");
        // Print the full array to show the new element and shifted elements
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Expected output: 10 20 30 35 40 50 
    }
}