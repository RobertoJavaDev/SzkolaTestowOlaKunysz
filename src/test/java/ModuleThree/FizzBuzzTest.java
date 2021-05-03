package ModuleThree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturnFizzWhenNumberDivisibleByThree() {
        //when
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.check(9);

        //then
        assertThat(result).contains("Fizz");

    }
}