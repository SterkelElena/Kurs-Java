package practice;

import java.util.Scanner;

public class TerOperator {
    public static void main(String[] args) {
        int a = 123;
        int b = 745;

        Scanner scanner = new Scanner(System.in); // wklütchaem schitiwanie s klawiaturi
        System.out.println("Input 1st number"); // priglaschenie polsowatelja dlja wwoda tchisla
        int number1 = scanner.nextInt(); // polutchenie tchisla s klawiaturi
        System.out.println("Input 2nd number"); // eto priglaschenie polsewatelü dlja wwoda tchisla
        int number2 = scanner.nextInt(); //

        int isMin = (a < b) ? a : b;

        int isMin2 = (number1 < number2) ? number1 : number2;

        System.out.println("Minimum = " + isMin);
        System.out.println("Minimum2 =" + isMin2);


    }


}
