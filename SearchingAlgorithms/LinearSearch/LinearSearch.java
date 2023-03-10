package Algoritms.SearchingAlgorithms.LinearSearch;

public class LinearSearch {

    public static int linearSearch (int array[], int x) {

        for (int i = 0; i<array.length ; i++){
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] data = { 7, 15, 17, -6, -3, 0 };
        int x = -6;

        int result = linearSearch(data, x);

        if (result == -1){
            System.out.print("Not Found.");
        }
        else{
            System.out.print("Element is present at index " + result);
        }
    }
        
}
