import java.util.Arrays;

public class BinarySearch {

    // Binary search function that handles edge cases
    public static int binarySearch(int[] arr, int target) {
        // Edge case: Empty array
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Found the target
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        // Test cases to cover all edge cases

        // 1. Normal case
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Index of 4: " + binarySearch(arr1, 4)); // Output: 3

        // 2. Target not present
        System.out.println("Index of 10: " + binarySearch(arr1, 10)); // Output: -1

        // 3. Array with one element (target present)
        int[] arr2 = {5};
        System.out.println("Index of 5: " + binarySearch(arr2, 5)); // Output: 0

        // 4. Array with one element (target absent)
        System.out.println("Index of 10: " + binarySearch(arr2, 10)); // Output: -1

        // 5. Empty array
        int[] arr3 = {};
        System.out.println("Index of 1: " + binarySearch(arr3, 1)); // Output: -1 (Array is empty)

        // 6. Array with duplicate elements
        int[] arr4 = {1, 2, 4, 4, 4, 5, 6};
        System.out.println("Index of 4: " + binarySearch(arr4, 4)); // Output: 2 (First occurrence)

        // 7. Searching the first element
        System.out.println("Index of 1: " + binarySearch(arr1, 1)); // Output: 0

        // 8. Searching the last element
        System.out.println("Index of 7: " + binarySearch(arr1, 7)); // Output: 6
    }
}
