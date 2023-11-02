package variables;

public class MethodsAdvAppl {
    public static void main(String[] args) {
        // dlina okruschnosti L = 2 * Pi * r
        double constanta = pi();
        System.out.println(constanta);
        printPi(constanta);
        double res = circleLength(100); // w skobkach - eto radius okruschnosti
        System.out.println("L = " + res);
    }

    public static double circleLength(double radius) {
        double l = 2 * pi() * radius;
        return l;
    }

    public static void printPi(double p) {
        System.out.println("Pi = " + p);
    }

    public static double pi() { // double - metod dolschen wernut takoi tip
        double pi = 3.1415926;
        return pi;
    }
}
