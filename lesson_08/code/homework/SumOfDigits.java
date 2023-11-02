package homework;
// Вводится положительное целое число, найдите сумму его цифр.
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: 13" );
        int n = scanner.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("Сумма цифр числа " + n + " равна " + sum);
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
