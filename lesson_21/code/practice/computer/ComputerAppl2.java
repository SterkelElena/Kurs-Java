package practice.computer;

import practice.computer.model.Computer2;
import practice.computer.model.Laptop2;
import practice.computer.model.Smartphone2;

public class ComputerAppl2 {
    public static void main(String[] args) {
        double a = 10;
        int b = (int) a;
        Computer2[] shop = new Computer2[5];
        shop[0] = new Computer2("i5", 12, 512, "HP");
        shop[1] = new Laptop2("i7", 16, 512, "Asus", 3, 2.1);
        shop[2] = new Laptop2("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone2("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l);
        printArray(shop);
        int total = getTotalSSDCapacity(shop);
        System.out.println("Total ssd capacity = " + total);
        Laptop2 laptop1 = (Laptop2) shop[1];
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);
        double res = getTotalLaptopHours(shop);
        System.out.println("Total laptops hours = " + res);
        total = getTotalSSDCapacity(shop);
        System.out.println("Total ssd laptops capacity = " + total);
    }

    public static void printArray(Computer2[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }

    public static int getTotalSSDCapacity(Computer2[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null ){
                res += arr[i].getSsd();

            }

        }
        return res;
    }
    public  static int getTotalSSDLaptopCapacity(Computer2[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop2 && ! (arr[i] instanceof Smartphone2)) {
                res += arr[i].getSsd();
            }
        }
        return res;
    }
    public static double getTotalLaptopHours(Computer2[] arr) {
        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop2) {
                Laptop2 laptop = (Laptop2) arr[i];
                res += laptop.getHours();

            }

        }
        return res;
    }
}


