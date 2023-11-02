package practice;

public class Conditions {
    public static void main(String[] args) {

        int x = 0;

        if (x > 0) {
            System.out.println("x - poloschitelnoe");
        } else if (x == 0) {
            System.out.println("x = 0");
        } else {
            System.out.println(" x - otrizatelnoe");
        }


        int y = 16;

        if (y % 2 == 0) {
            System.out.println("tscshislo: " + y + " - tschötnoe");
        } else {
            System.out.println("tschislo: " + y + " - NE tschötnoe");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("wam rasrescheno deistwowat samostojatelno");
        } else {
            System.out.println("wam nado pridti wmeste s waschim opekunom");
        }

    }
}
