package practice;

import java.util.Scanner;

public class Ampel {
    public static void main(String[] args) {


        // Как будем кодировать цвет сфетофора?
        // Либо цифрами 1, 2, 3, либо пользователь вводит строку, либо задаём в программе строкой (переменная типа String)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wait is the color? (Red, Yellow, Green):");
        String color = scanner.next(); // задаём переменную строкового типа String

        switch (color) {
            case "Red" -> System.out.println("Stop, wait!");
            case "Yellow" -> System.out.println("Be ready to go!");
            case "Green" -> System.out.println("You can go!");
            default -> System.out.println("Wrong input!");
        }
    }
}
