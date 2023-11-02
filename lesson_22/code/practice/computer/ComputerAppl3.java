package practice.computer;

import practice.computer.model.Computer3;
import practice.computer.model.Laptop3;
import practice.computer.model.Smartphone3;

public class ComputerAppl3 {
    public static void main(String[] args) {
        Computer3[] shop = new Computer3[5];
        shop[0] = new Computer3("i5", 12, 512, "HP");
        shop[1] = new Laptop3("i7", 24, 1024, "Asus", 3, 2.1);//upper casting from Laptop to Computer
        shop[2] = new Laptop3("i7", 24, 1024, "Asus", 4.5, 2.2);
        shop[3] = new Smartphone3("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789098l);
        printArray(shop);
        System.out.println("===================================================================");
        Computer3 computer = new Computer3("i5", 12, 512, "HP");
        boolean checker = shop[0].equals(computer);
        System.out.println(checker);
        checker = shop[3].equals(computer);
        System.out.println(checker);
        checker = shop[1].equals(shop[2]);
        System.out.println(checker);
        Smartphone3 smartphone = new Smartphone3("Snapdragon", 8, 128, "Samsung", 24, 0.15, 123456789097l);
        checker = smartphone.equals(shop[3]);
        System.out.println(checker);
    }

    public static void printArray(Computer3[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].toString());
            }
        }
    }
}