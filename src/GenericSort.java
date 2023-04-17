import java.util.ArrayList;

public class GenericSort {

  public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if (arr[j].compareTo(arr[j+1]) > 0) {
          T temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public static <T extends Comparable<T>> void selectionSort(T[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      int min_idx = i;
      for (int j = i+1; j < n; j++) {
        if (arr[j].compareTo(arr[min_idx]) < 0) {
          min_idx = j;
        }
      }
      T temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  public static <T extends Comparable<T>> void insertionSort(T[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
      T key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j].compareTo(key) > 0) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }

  public static <T extends Comparable<T>> void shellSort(T[] arr) {
    int n = arr.length;
    for (int gap = n/2; gap > 0; gap /= 2) {
      for (int i = gap; i < n; i += 1) {
        T temp = arr[i];
        int j;
        for (j = i; j >= gap && arr[j - gap].compareTo(temp) > 0; j -= gap) {
          arr[j] = arr[j - gap];
        }
        arr[j] = temp;
      }
    }
  }

  public static <T extends Comparable<T>> void quickSort(T[] arr, int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi-1);
      quickSort(arr, pi+1, high);
    }
  }

  private static <T extends Comparable<T>> int partition(T[] arr, int low, int high) {
    T pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j].compareTo(pivot) < 0) {
        i++;
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    T temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return i+1;
  }
  
  public static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
	    if (left < right) {
	        int mid = (left + right) / 2;
	        mergeSort(arr, left, mid);
	        mergeSort(arr, mid + 1, right);

	        ArrayList<T> tempArr = new ArrayList<>();
	        int i = left;
	        int j = mid + 1;

	        while (i <= mid && j <= right) {
	            if (arr[i].compareTo(arr[j]) <= 0) {
	                tempArr.add(arr[i]);
	                i++;
	            } else {
	                tempArr.add(arr[j]);
	                j++;
	            }
	        }

	        while (i <= mid) {
	            tempArr.add(arr[i]);
	            i++;
	        }

	        while (j <= right) {
	            tempArr.add(arr[j]);
	            j++;
	        }

	        for (int k = left; k <= right; k++) {
	            arr[k] = tempArr.get(k - left);
	        }
	    }
	}
}
