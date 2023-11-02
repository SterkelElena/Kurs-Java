package homework;

import practice.BubbleSortV2;

public class Array1 {
    public static void main(String[] args) {

        int[] arr1 = {43, 75, 21, 12, -321, 37, -14, 23, 8, 13};
        int[] arr2 = {98, 48, -5, 3, 44, 25, 18, 32, -50, 55, 33, 81, -205, 79, 0, 7, 68, 11, 40, 71};

        BubbleSortV2.printArray(arr1);
        SortingMethods.selectionSort(arr1);
        BubbleSortV2.printArray(arr2);
        SortingMethods.selectionSort(arr2);

        System.out.println("Selection Sort arr1");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Bubble Sort arr1");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Selection Sort arr2");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Bubble Sort arr2");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
