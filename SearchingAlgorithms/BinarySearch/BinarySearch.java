package Algoritms.SearchingAlgorithms.BinarySearch;

public class BinarySearch {

    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = (left + right) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }


    public static void main(String args[]) {
        int[] data = { -6, -3, 0, 7, 15, 17 };
        int x = -3;

        //int result = binarySearchIterative(data, x);
        int result = binarySearchRecursive(data, x, 0, data.length-1);

        if (result == -1){
            System.out.print("Not Found.");
        }
        else{
            System.out.print("Element is present at index " + result);
        }
    }
}
