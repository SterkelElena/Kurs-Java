package homework;
// Написать программу для "Кофе-машины", которая позволяет пользователю выбрать напиток:
//Эспрессо
//Американо
//Латте
//Капучино После выбора программа должна сообщить стоимость выбранного напитка.
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - americano, 3 - latte, 4 - cappuccino");
        String drink = scanner.next();

        switch (drink) {
            case "1" -> System.out.println("This is Espresso! / ESPRESSO_PRICE = 2");
            case "2" -> System.out.println("This is Americano! /AMERICANO_PRICE = 3");
            case "3" -> System.out.println("This is Latte! / LATTE_PRICE = 4");
            case "4" -> System.out.println("This is Cappuccino! / CAPPUCCINO_PRICE = 5");
            default -> System.out.println("Invalid input");
        }
    }
}

