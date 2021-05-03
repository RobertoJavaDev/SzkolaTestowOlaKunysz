package ModuleThree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzWhenNumberDivisibleByThree() {
        //when
        String result = fizzBuzz.check(99);

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

    @Test
    void shouldReturnFizzBuzzWhenNumberDivisibleByThreeAndFive() {
        //when
        String result = fizzBuzz.check(75);

        //then
        assertThat(result).contains("FizzBuzz");
    }

    @Test
    void shouldReturnNumberWhenNumberNonDivisibleByThreeAndFive() {
        //when
        String result = fizzBuzz.check(11);

        //then
        assertThat(result).contains("11");
    }
}