package homework.product.model;

public class MeatFood extends Food {
    private String meatType;
    public MeatFood(String name, long barCode, double price, String expDate, String meatType) {
        super(name, barCode, price, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    @Override
    public String toString() {
        return "MeatFood {" +
                "name='" + getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", price=" + getPrice() +
                ", expDate='" + getExpDate() + '\'' +
                ", meatType='" + meatType + '\'' +
                '}';
    }
}
