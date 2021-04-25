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

    @Test
    void shouldReturn20WhenOnePinThrowInRoll() {
        //given
        BowlingKata theGame = new BowlingKata();

        //when
        int result = theGame.add(20,1);

        //then
        assertThat(result).isEqualTo(20);
    }
}