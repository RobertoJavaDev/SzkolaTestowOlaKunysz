package ModuleTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class VatServiceTest {

    VatService vatService;
    VatProvider vatProvider;

    private Product generateProduct(int id, double netPrice, String type) {
        return new Product(id, netPrice, type);
    }

    @Test
    void shouldCalculateVatValueForDefaultVat() throws Exception {
        //given
        Product product = generateProduct(1, 100, "Groceries");

        //when
        double result = vatService.getGrossPriceForDefaultVat(product);

        //then
        assertEquals(123, result);
    }

    //    @Test
//    void shouldCalculateGrossPriceForDifferentVatValue() throws Exception {
//        //given
//
//        //when
//        double result = vatService.getGrossPriceForDifferentVat(100,0.1);
//
//        //then
//        assertEquals(110,result);
//
//    }
    @BeforeEach
    void prepareVatService() {
        vatProvider = Mockito.mock(VatProvider.class);
        vatService = new VatService(vatProvider);
    }
}