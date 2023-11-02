package practice;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {

        int timeForGame = 60; // skoljko rasrescheno igratj na compjutere

        Scanner scanner = new Scanner(System.in); // wklütchili wwod dannich s klawiaturi
        System.out.println("Input today's mark"); // priglaschenie k wwodu
        int mark = scanner.nextInt(); // polutchenie ozenki s klawiaturi

        switch (mark) {
            case 1 : {
                System.out.println("Good child!"); // pochwalili
                timeForGame = timeForGame + 30; // uwelichili wremja
                System.out.println("Time for game = " + timeForGame + "min.");
                break;
            }
            case 2 : {
                System.out.println("Sehr gut!");
                break;
            }
            case 3 : {
                System.out.println("No so good!");
                timeForGame = timeForGame - 30;
                break;
            }
            case 4 : {
                System.out.println("Very bad!");
                timeForGame = 0;
                break;
            }
            case 5 : {
                System.out.println("Shame you!");
                System.out.println("No games for 2 days!");
                break;
            }
            default: {
                System.out.println("Wrong input!"); // esli poljsowatelj wwöl schto -to drugoe (chislo)
            }
        }

    }
}
