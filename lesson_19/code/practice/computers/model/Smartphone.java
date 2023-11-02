package practice.computers.model;

public class Smartphone extends Laptop {
    private long imei;
    private String model;
    public Smartphone(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity,
                      double weight, long imei, String model) {
        super(cpu, ram, hdd, brand, display, batteryCapacity, weight);
        this.imei = imei;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Smartphone {" +
                "imei=" + imei +
                ", model='" + model + '\'' +
                '}';
    }
}


