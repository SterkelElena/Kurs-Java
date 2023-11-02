package practice.computer.model;

public class Smartphone3 extends Laptop3{
    private long imei;

    public Smartphone3(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public String toString() {
        return super.toString() + ", IMEI: " + imei;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Smartphone3)) {
            return false;
        }
        Smartphone3 other = (Smartphone3) object;
        return imei == other.imei;
    }
}
