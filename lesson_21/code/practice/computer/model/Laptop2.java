package practice.computer.model;

public class Laptop2 extends Computer2{
    private double hours;
    private double weight;

    public Laptop2(String cpu, int ram, int ssd, String brand, double hours, double weight) {
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

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        return super.toString() + ",Hours: " + hours + "; Weight: " + weight;
    }
}


