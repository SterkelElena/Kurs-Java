package homework;
// Распечатайте все числа меньшие 200 и кратные 13.

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 200) {
            if (i % 13 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
