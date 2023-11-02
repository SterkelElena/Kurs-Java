package practice.computer;

import practice.computer.model.Computer1;
import practice.computer.model.Laptop1;
import practice.computer.model.Smartphone1;

public class ComputerAppl1 {
    public static void main(String[] args) {
        double a = 10;
        int[] arr = new int[10];
        System.out.println(arr);
        Computer1[] shop = new Computer1[4];
        System.out.println(shop);
        shop[0] = new Computer1("i5", 12, 512,"HP");
        shop[1] = new Laptop1("i7", 16, 512, "Asus", 3, 2.1);
        shop[2] = new Laptop1("i7", 24, 1024, "Asus", 3, 2.1);
        shop[3] = new Smartphone1("Snapdragon", 8, 128, "Samsung", 24,
                0.15, 123456789098l);
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);
        }
        //Object computer1 = new Computer1("i5", 12, 512,"HP");
        //Object laptop1 = new Laptop1("i7", 16, 512, "Asus", 3, 2.1);
        //System.out.println(computer1);
        //System.out.println(laptop1);
    }
}
