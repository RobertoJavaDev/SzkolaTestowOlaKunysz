package ModuleTwo;

public class VatService {
    double vatValue;

    public VatService(){
        this.vatValue=0.23;
    }

    public double getGrossPriceForDefaultVat (Product product) throws Exception {
        return calculateGrossPrice(product.getNetPrice(), vatValue);
    }

    public double getGrossPriceForDifferentVat (Product product, double vatValue) throws Exception {
        return calculateGrossPrice(product.getNetPrice(),vatValue);
    }

    private double calculateGrossPrice(double netPrice, double vatValue) throws Exception{
        if (vatValue>1){
            throw new Exception("Incorrect worth of VAT ! VAT value can not be higher than 100% !!!");
        }
        return netPrice*(1+vatValue);
    }
}
