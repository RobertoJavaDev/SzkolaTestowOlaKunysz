package ModuleThree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BowlingKataTest {

    BowlingKata theGame = new BowlingKata();

    @Test
    void shouldReturnZeroWhenAllRollsAreMissed() {
        //given

        //when
        roll(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

        //then
        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldReturn20WhenOnePinThrowInRoll() {
        //given

        //when
        roll(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);

        //then
        assertThat(theGame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldReturn16WhenThrowSpareInFirstFrame() {
        //given

        //when
        roll(5,5,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

        //then
        assertThat(theGame.getScore()).isEqualTo(16);
    }

    @Test
    void shouldReturn24WhenThrowStrikeInFirstFrame() {
        //given

        //when
        roll(10,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

        //then
        assertThat(theGame.getScore()).isEqualTo(24);
    }

    @Test
    void shouldReturn300WhenStrikeInAllThrows() {
        //given

        //when
        roll(10,10,10,10,10,10,10,10,10,10,10,10);

        //then
        assertThat(theGame.getScore()).isEqualTo(300);

    }

    private void roll(int... pins) {
        for (int pin:pins) {
            theGame.roll(pin);
        }
    }
}