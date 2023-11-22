package practice.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        Set<Integer> numbers = new HashSet<>();

        System.out.println("Введите числа:");

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        numbers.removeIf(n -> n > 10);

        System.out.println("Результаты:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

