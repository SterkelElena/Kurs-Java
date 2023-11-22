package practice.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LandsOfGermany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество названий земель: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // считываем символ новой строки, чтобы не влиять на следующий ввод

        Set<String> landNames = new HashSet<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Введите название земли: ");
            String name = scanner.nextLine();
            landNames.add(name);
        }

        System.out.println("Названия земель:");
        for (String name : landNames) {
            System.out.println(name);
        }
    }
}

