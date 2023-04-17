
public class TestSortGenerico {

  public static <T> void showArray(T[] arr) {
    for (T element : arr) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Integer[] arrInt = {10, 7, 8, 9, 1, 5};
    System.out.println("Array desordenado:");
    showArray(arrInt);
    GenericSort.quickSort(arrInt, 0, arrInt.length-1);
    System.out.println("Array ordenado con quickSort:");
    showArray(arrInt);

    Character[] arrChar = {'c', 'a', 'e', 'd', 'b'};
    System.out.println("Array desordenado:");
    showArray(arrChar);
    GenericSort.selectionSort(arrChar);
    System.out.println("Array ordenado con selectionSort:");
    showArray(arrChar);

    String[] arrString = {"hola", "adios", "que", "tal", "estas"};
    System.out.println("Array desordenado:");
    showArray(arrString);
    GenericSort.bubbleSort(arrString);
    System.out.println("Array ordenado con bubbleSort:");
    showArray(arrString);

    Golosinas[] arrGolosinas = {new Golosinas("Chocolate", 3), new Golosinas("Gomitas", 2), new Golosinas("Paleta", 1)};
    System.out.println("Array desordenado:");
    showArray(arrGolosinas);
    GenericSort.insertionSort(arrGolosinas);
    System.out.println("Array ordenado con insertionSort:");
    showArray(arrGolosinas);
  }
}
