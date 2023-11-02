package homework;

import java.util.Random;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        System.out.print("Random numbers: ");
        for (int number : array) {
            System.out.print(number + " ");

        }
    }
}

