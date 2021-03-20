package ModuleTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VatServiceTest {

    VatService vatService = new VatService();
    private Product generateProduct(int id, double vatValue){
        return new Product(id,vatValue);
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
}