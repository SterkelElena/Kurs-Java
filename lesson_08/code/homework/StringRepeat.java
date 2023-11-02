package homework;
//  Программа получает на вход строку и число повторений этой строки.
//  Программа должна вывести эту строку нужное количество раз.
import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество повторений:");
        int n = scanner.nextInt();
        System.out.println("Введите строку:");
        String str = scanner.next();
        int m = 0;
        while (m < n) {
            System.out.println(str);
            m++;

        }
    }
}




