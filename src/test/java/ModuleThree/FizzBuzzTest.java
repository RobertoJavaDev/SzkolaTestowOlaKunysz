package ModuleThree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzWhenNumberDivisibleByThree() {
        //when
        String result = fizzBuzz.check(9);

        //then
        assertThat(result).contains("Fizz");
    }

    @Test
    void shouldReturnBuzzWhenNumberDivisibleByFive() {
        //when
        String result = fizzBuzz.check(25);

        //then
        assertThat(result).contains("Buzz");
    }
}