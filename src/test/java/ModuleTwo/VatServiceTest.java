package ModuleTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VatServiceTest {

    VatService vatService = new VatService();
    private Product generateProduct(int id, double netPrice){
        return new Product(id,netPrice);
    }

    @Test
    void shouldCalculateVatValueForDefaultVat() throws Exception {
        //given
        Product product = generateProduct(1,100);

        //when
        double result = vatService.getGrossPriceForDefaultVat(product);

        //then
        assertEquals(123,result);
    }

    @Test
    void shouldCalculateGrossPriceForDifferentVatValue() throws Exception {
        //given

        //when
        double result = vatService.getGrossPriceForDifferentVat(100,0.1);

        //then
        assertEquals(110,result);

    }
}