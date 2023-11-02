package homework;

import practice.ArrayMethods;

public class MyArrayAppl {
    public static void main(String[] args){
        int[] arr = {42, 8, 13, 37, 2, -20, 65, 23, 29, 73};
        int min = MyArrayMethods.findMin(arr);
        System.out.println("Minimum: " + min);
        int minIndex = MyArrayMethods.findMinIndex(arr);
        System.out.println("Index of min element: " + minIndex);
        ArrayMethods.sortArray(arr); // выполняем сортировку
        ArrayMethods.printArray(arr); // печатаем после сортировки
        ArrayMethods.split();

    }
}

