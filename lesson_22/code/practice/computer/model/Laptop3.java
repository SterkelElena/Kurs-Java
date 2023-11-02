package practice.computer.model;

public class Laptop3 extends Computer3{
    private double hours;
    private double weight;

    public Laptop3(String cpu, int ram, int ssd, String brand, double hours, double weight) {
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

    public String toString() {
        return super.toString() + ", Hours: " + hours + ", Weight: " + weight;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Laptop3)){
            return false;
        }
        Laptop3 other = (Laptop3) object;
        return super.equals(other) && hours == other.hours && weight == other.weight;
    }

}
