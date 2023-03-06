package Algoritms.BubbleSort;


import java.util.Arrays;

class Main {

  static void BubbleSort(int array[]) {
    int size = array.length;
    
    for (int i = 0; i < (size-1); i++) {

      boolean swapped = false;

      for (int j = 0; j < (size-i-1); j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = true;
        }
      }
      if (!swapped)
        break;

    }
  }

  public static void main(String args[]) {
      
    int[] data = { -7, 49, 55, 1, -27, 9, 41 };
    
    // call method using the class name
    Main.BubbleSort(data);
    
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}