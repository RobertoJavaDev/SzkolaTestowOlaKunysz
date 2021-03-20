package ModuleTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VatServiceTest {

    VatService vatService;
    VatProvider vatProvider;

    @Test
    void shouldCalculateVatValueForDefaultVat() throws Exception {
        //given
        String type = "Groceries";
        Mockito.when(vatProvider.getDefaultVat()).thenReturn(0.23);
        Product product = generateProduct(1, 100, type);

        //when
        double result = vatService.getGrossPriceForDefaultVat(product);

        //then
        //JUnit
        assertEquals(123, result);

        //AssertJ
        assertThat(result).isEqualTo(123);
    }

    @Test
    void should_calculate_gross_price_for_different_vat() throws Exception {
        //given
        String type = "Buildings materials";
        Mockito.when(vatProvider.getVatForType(type)).thenReturn(0.08);

        //when
        double result = vatService.getGrossPrice(100, type);

        //then
        //JUnit
        assertEquals(108, result);

        //AssertJ
        assertThat(result).isEqualTo(108);
    }

    private Product generateProduct(int id, double netPrice, String type) {
        return new Product(id, netPrice, type);
    }

    @BeforeEach
    void prepareVatService() {
        vatProvider = Mockito.mock(VatProvider.class);
        vatService = new VatService(vatProvider);
    }
}