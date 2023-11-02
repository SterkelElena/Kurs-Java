package homework.product.model;

public class Food extends Product {
    private String expDate;
    public Food(String name, long barCode, double price,String expDate) {
        super(name, barCode, price);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "Food {" +
                "name='" +getName() + '\'' +
                ", barCode=" + getBarCode() +
                ", price=" + getPrice() +
                ", expDate='" + expDate + '\'' +
                '}';
    }
}

