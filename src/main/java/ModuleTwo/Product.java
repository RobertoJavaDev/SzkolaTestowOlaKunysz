package ModuleTwo;

public class Product {

    int id;
    double netPrice;

    public Product (int id, double netPrice){
        this.id = id;
        this.netPrice = netPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }
}
