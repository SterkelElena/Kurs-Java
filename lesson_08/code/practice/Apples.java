package practice;

public class Apples {
    public static void main(String[] args) {

        int apples = 30; // стартовые значения
        int counter = 0; // счётчик
        int applesInCycle = apples; // параметр

        while (applesInCycle > 0) {
            // тело цикла
            System.out.println("Take one apple from basket ");
            applesInCycle = applesInCycle - 1; // изменяем параметр цикла
            // applesInCycle--;
            counter++; // количество выполненых операций
            System.out.println("The rest of apples " + applesInCycle);
        }
        System.out.println("The job is done, total apples " + counter + " added in pei from " + apples + " in basket.");
    }
}
