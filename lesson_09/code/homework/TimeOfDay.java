package homework;
//Определение времени суток. Напишите программу, которая принимает текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
import java.util.Scanner;
public class TimeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the time of day from 0 to 23: ");
            int time = scanner.nextInt();
            switch (time) {
                case 0, 1, 2, 3:
                    System.out.println("Good night");
                    break;
                case 4, 5, 6, 7, 8, 9, 10, 11:
                    System.out.println("Good morning");
                    break;
                case 12, 13, 14, 15, 16:
                    System.out.println("Good afternoon");
                    break;
                case 17, 18, 19, 20, 21, 22, 23:
                    System.out.println("Good evening");
                    break;
                default:
                    System.out.println("Wrong Input!");
            }
        }
    }
}

