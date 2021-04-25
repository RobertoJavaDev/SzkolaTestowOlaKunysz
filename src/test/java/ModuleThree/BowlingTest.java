package ModuleThree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BowlingKataTest {

    @Test
    void shouldReturnZeroWhenAllRollsAreMissed() {
        //given
        BowlingKata theGame = new BowlingKata();

        //when
        int result = theGame.add(21, 0);

        //then
        assertThat(result).isEqualTo(0);

    }
}