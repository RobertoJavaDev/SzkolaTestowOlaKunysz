package ModuleTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class VatServiceTest {

    VatService vatService;
    VatProvider vatProvider;

    @Test
    void shouldCalculateVatValueForDefaultVat() throws IncorrectVatException {
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
    void should_calculate_gross_price_for_different_vat() throws IncorrectVatException {
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

    @Test
    void should_calculate_gross_price_for_one_hundred_percent_vat() throws IncorrectVatException {
        //given
        String type = "Cigarette";
        Mockito.when(vatProvider.getVatForType(type)).thenReturn(1.0);

        //when
        double result = vatService.getGrossPrice(100, type);

        //then
        //JUnit
        assertEquals(200, result);

        //AssertJ
        assertThat(result).isEqualTo(200);
    }

    @Test
    void should_calculate_gross_price_for_product_exempt_from_vat() throws IncorrectVatException {
        //given
        String type = "Meds";
        Mockito.when(vatProvider.getVatForType(type)).thenReturn((double) 0);

        //when
        double result = vatService.getGrossPrice(100, type);

        //then
        //JUnit
        assertEquals(100, result);

        //AssertJ
        assertThat(result).isEqualTo(100);
    }

    @Test
    void should_throw_exception_when_vat_is_too_high(){
        //given
        String type = "Non exist product";
        Product product = generateProduct(1, 100, type);
        Mockito.when(vatProvider.getVatForType(type)).thenReturn(3.1);

        //when

        //then
        //JUnit
        assertThrows(IncorrectVatException.class, () -> {
            vatService.getGrossPrice(product.getNetPrice(), type);
        });
        //AssertJ
        assertThatExceptionOfType(IncorrectVatException.class).isThrownBy(
                () -> {
                    vatService.getGrossPrice(product.getNetPrice(), type);
                });
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