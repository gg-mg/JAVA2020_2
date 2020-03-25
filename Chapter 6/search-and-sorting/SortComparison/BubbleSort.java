public class BubbleSort {
  /** bubble sort method */
  public static void bubbleSort(int[] list) {
    boolean swapping = true;
    
    for (int i = 1; i < list.length && swapping; i++) {
      // array is already sorted if no swapping happened in the previous inner loop
      swapping = false; // assume no swapping, before entering the inner loop
      for (int j = 0; j < list.length - i; j++) {
        if (list[j] > list[j + 1]) {
          // Swap list[j] with list[j + 1]
          int temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
          
          swapping = true; // still swapping 
        } // end of swapping judgment
      } // end of inner loop
    } // end of outer loop
  } // end of sorting method
}
