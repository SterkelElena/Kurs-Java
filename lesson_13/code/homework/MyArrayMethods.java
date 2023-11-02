package homework;
// задайте собственный массив из целых чисел на 10 элементов,
// найдите минимальный элемент и его индекс. Лучше сделать в своих классах по аналогии с классной работой.
public class MyArrayMethods {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}
