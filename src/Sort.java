
public class Sort {

  public static <T extends Comparable<T>> void brickSort(T[] arr) {
    boolean swapped = true;
    int start = 0;
    int end = arr.length - 1;

    while (swapped == true) {
      swapped = false;

      for (int i = start; i < end; i++) {
        if (arr[i].compareTo(arr[i+1]) > 0) {
          T temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          swapped = true;
        }
      }

      if (swapped == false) break;

      swapped = false;

      end--;

      for (int i = end-1; i >= start; i--) {
        if (arr[i].compareTo(arr[i+1]) > 0) {
          T temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          swapped = true;
        }
      }

      start++;
    }
  }
  public static <T extends Comparable<T>> void shakerSort(T[] arr) {
	    int left = 0;
	    int right = arr.length - 1;
	    boolean swapped = true;

	    while (left < right && swapped) {
	      swapped = false;

	      for (int i = left; i < right; i++) {
	        if (arr[i].compareTo(arr[i + 1]) > 0) {
	          swap(arr, i, i + 1);
	          swapped = true;
	        }
	      }

	      right--;

	      for (int i = right; i > left; i--) {
	        if (arr[i].compareTo(arr[i - 1]) < 0) {
	          swap(arr, i, i - 1);
	          swapped = true;
	        }
	      }

	      left++;
	    }
	  }

	  private static <T extends Comparable<T>> void swap(T[] arr, int i, int j) {
	    T temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	  }
}
