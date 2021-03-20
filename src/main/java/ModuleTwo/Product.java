package ModuleTwo;

public class Product {

    int id;
    double netPrice;
    String type;

    public Product (int id, double netPrice, String type){
        this.id = id;
        this.netPrice = netPrice;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
