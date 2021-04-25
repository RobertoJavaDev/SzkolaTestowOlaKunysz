package ModuleThree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BowlingKataTest {

    BowlingKata theGame = new BowlingKata();

    @Test
    void shouldReturnZeroWhenAllRollsAreMissed() {
        //given

        //when
        roll(20,0);

        //then
        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldReturn20WhenOnePinThrowInRoll() {
        //given

        //when
        roll(20,1);

        //then
        assertThat(theGame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldReturn16WhenThrowSpareInFirstFrame() {
        //given

        //when
        roll(1,5);
        roll(1,5);
        roll(1,3);
        roll(17,0);

        //then
        assertThat(theGame.getScore()).isEqualTo(16);
    }

    @Test
    void shouldReturn24WhenThrowStrikeInFirstFrame() {
        //given

        //when
        roll(1,10);
        roll(1,3);
        roll(1,4);
        roll(17,0);

        //then
        assertThat(theGame.getScore()).isEqualTo(24);

    }

    private void roll(int rolls, int pins) {
        for (int i = 0; i <rolls; i++) {
            theGame.roll(pins);
        }
    }
}