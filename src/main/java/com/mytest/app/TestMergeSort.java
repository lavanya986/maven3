import java.util.Arrays;

public class TestMergeSort {
    public static void main(String[] args) {
        // Test Case 1: Standard Unsorted Array
        int[] case1 = {12, 11, 13, 5, 6, 7};
        runTest("Standard", case1);

        // Test Case 2: Already Sorted
        int[] case2 = {1, 2, 3, 4, 5};
        runTest("Sorted", case2);

        // Test Case 3: Reverse Sorted
        int[] case3 = {10, 8, 6, 4, 2};
        runTest("Reverse", case3);

        // Test Case 4: Single Element & Empty
        int[] case4 = {42};
        int[] case5 = {};
        runTest("Single", case4);
        runTest("Empty", case5);
    }

    static void runTest(String name, int[] arr) {
        System.out.print(name + " Before: " + Arrays.toString(arr));
        MergeSort.sort(arr, 0, arr.length - 1);
        System.out.println(" -> After: " + Arrays.toString(arr));
    }
}
