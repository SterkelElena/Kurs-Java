package practice.computer;

import practice.computer.model.Computer2;
import practice.computer.model.Laptop2;
import practice.computer.model.Smartphone2;

public class CastingAppl {
    public static void main(String[] args) {
        Computer2 lap1 = new Laptop2("i7", 16, 512, "Asus", 3, 2.1);
        System.out.println(lap1);
        if(lap1 instanceof Laptop2) {
            Laptop2 laptop1 = (Laptop2) lap1;
            laptop1.setHours(4.5);
            System.out.println(laptop1);
        }
        System.out.println(lap1);
        Computer2 smart1 = new Smartphone2("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l);
        if (smart1 instanceof Smartphone2) {
            Smartphone2 smartphone1 = (Smartphone2) smart1;
            System.out.println(smartphone1.getImei());
        }
        if (lap1 instanceof Smartphone2) {
            Smartphone2 smartphone2 = (Smartphone2) lap1;
            System.out.println(smartphone2);
        } else {
            System.out.println("lap1 not a Smartphone");
        }
    }
}
