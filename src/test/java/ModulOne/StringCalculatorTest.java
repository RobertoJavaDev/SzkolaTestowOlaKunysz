package ModulOne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calculator;

    @BeforeEach
    public void setUp(){
    createCalculator();
    }

    @Test
    void shouldSumWhenNotNumberGiven() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    void shouldSumFourNumbersWhenFourPrimeNumbersGiven() {
        assertEquals(17,calculator.add("2,3,5,7"));
    }

    @Test
    void shouldSumNumbersWhenAnyOfNumberIsNegative() {
        assertEquals(7,calculator.add("1,-3,4,5"));
    }

    @Test
    void shouldThrowExceptionWhenAlphabetCharacterGiven() {
        assertThrows(NumberFormatException.class, ()-> calculator.add("a,b,c,d"));
    }

    private void createCalculator() {
        calculator = new StringCalculator();
    }
}