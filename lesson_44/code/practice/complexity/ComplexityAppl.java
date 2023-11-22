package practice.complexity;

import java.util.Arrays;

public class ComplexityAppl {
    public static void main(String[] args) {
        // заведём простой массив целых чисел
        // будем выполнять с ним различные операции (вычисление среднего, сложение элементов, поиск элемента, поиск мин и макс, сортировка)
        // оценим вычислительную сложность алгоритма

        int[] arr = {-24, 7, -67, 15, 8, 93, 1};

        // вычисление среднего значения:
        /*
        - узнать длину массива
        - в цикле складываем элементы
        - сумму делим на количество элементов
         */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length; // кастинг в другой тип данных
        System.out.println(avg);

        // Что будет происходить при росте количества элементов массива?
        // Это линейная сложность - так как количество операций прямо пропорционально количеству элементов массива.
        // O(n) - это вычислительная сложность

        // поиск элемента
        // - если пробегаем по массиву, то сложность линейная O(n)
        // - если бинарный поиск

        // Arrays.sort(arr); // сортируем

        System.out.println(Arrays.toString(arr));
        System.out.println("=============================================================");
        int index = Arrays.binarySearch(arr, -67);
        System.out.println(index);

        index = Arrays.binarySearch(arr, 93);
        System.out.println(index);

        index = Arrays.binarySearch(arr, -100);
        System.out.println(index);

        // При 8 элементах - 3 итерации деления массива
        // При 16 элементах - 4 итерации
        // ....
        // 1024 элемента - 10 итераций
        // 2048 элемента - 11 итераций
        // O(log(n)) - это логарифмическая сложность (самая низкая!)

        // сортировка методом BubbleSort сравниваем по 2 элемента, i - й с i + 1 -ым
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[j + 1]){
                    // переставим элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        // это квадратичная сложность O(n^2))

        Arrays.sort(arr); // сортируем целые числа - оценим отдельно
        System.out.println(Arrays.toString(arr));
        // сложность в методе sort - полилинейная
    }
}
