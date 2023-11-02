package homework.product.model;

public class MilkFood extends Food {
    private String milkType;
    private double fat;
    public MilkFood(String name, long barCode, double price, String expDate, String milkType, double fat) {
        super(name, barCode, price, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }

    public double getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return "MilkFood {" +
                "name='" + getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", price=" + getPrice() +
                ", expDate='" + getExpDate() + '\'' +
                ", milkType='" + milkType + '\'' +
                ", fat=" + fat +
                '}';
    }
}
