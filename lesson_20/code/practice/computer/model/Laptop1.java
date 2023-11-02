package practice.computer.model;

public class Laptop1 extends Computer1 {
    private double hours;
    private double weight;

    public Laptop1(String cpu, int ram, int ssd, String brand, double hours, double weight) {
        super(cpu, ram, ssd, brand);
        this.hours = hours;
        this.weight = weight;
    }

    public double getHours() {
        return hours;
    }

    public double getWeight() {
        return weight;
    }


    public String toString(){
        return super.toString() + ",Hours: " + hours + "; Weight: " + weight;
    }

}
