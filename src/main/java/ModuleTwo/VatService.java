package ModuleTwo;

public class VatService {

    VatProvider vatProvider;

    public VatService(VatProvider vatProvider){
        this.vatProvider = vatProvider;
    }

    public double getGrossPriceForDefaultVat (Product product) throws IncorrectVatException {
        return calculateGrossPrice(product.getNetPrice(), vatProvider.getDefaultVat());
    }

    public double getGrossPrice (double netPrice, String type) throws IncorrectVatException {
        double vatValue = vatProvider.getVatForType(type);
        return calculateGrossPrice(netPrice,vatValue);
    }

    private double calculateGrossPrice(double netPrice, double vatValue) throws IncorrectVatException{
        if (vatValue>1){
            throw new IncorrectVatException ("Incorrect worth of VAT ! VAT value can not be higher than 100% !!!");
        }
        return netPrice*(1+vatValue);
    }
}
