package practice.computers;

import practice.computers.model.Computer;
import practice.computers.model.Laptop;
import practice.computers.model.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {

        Computer[] comp = new Computer[4];
        comp[0] = new Computer("i9", 16, 522, "Asus");
        //System.out.println(comp[0]);
        comp[1] = new Laptop("i5", 8, 256, "Acer", "14", 1000, 2);
        //System.out.println(comp[1]);
        comp[2] = new Laptop("M2", 16, 512, "MacBook", "14", 5000, 1.6);
        comp[3] = new Smartphone("Octa-Core",8, 128, "Samsung", "6.1",
                3700, 0.16, 350330051759295L, "Galaxy S22" );

        for (int i = 0; i < comp.length; i++) {
            System.out.println(comp[i]);
        }

        int sumHdd = 0;
        for (int i = 0; i < comp.length; i++) {
            sumHdd = sumHdd + comp[i].getHdd();
        }
        System.out.println("Total HDD = " + sumHdd);

    }
}
