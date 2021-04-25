package ModuleThree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BowlingKataTest {

    BowlingKata theGame = new BowlingKata();

    @Test
    void shouldReturnZeroWhenAllRollsAreMissed() {
        //given

        //when
        roll("-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-");

        //then
        assertThat(theGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldReturn20WhenOnePinThrowInRoll() {
        //given

        //when
        roll("1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1");

        //then
        assertThat(theGame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldReturn16WhenThrowSpareInFirstFrame() {
        //given

        //when
        roll("5","/","3","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-");

        //then
        assertThat(theGame.getScore()).isEqualTo(16);
    }

    @Test
    void shouldReturn24WhenThrowStrikeInFirstFrame() {
        //given

        //when
        roll("X","3","4","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-","-");

        //then
        assertThat(theGame.getScore()).isEqualTo(24);
    }

    @Test
    void shouldReturn300WhenStrikeInAllThrows() {
        //given

        //when
        roll("X","X","X","X","X","X","X","X","X","X","X","X");

        //then
        assertThat(theGame.getScore()).isEqualTo(300);
    }

    private void roll(String... pins) {
        int lastThrow = 0;
        for (String pin:pins) {

            if (pin == "X"){
                int strike = 10;
                theGame.roll(strike);
            }
            else if (pin == "/"){
                int spare = 10-lastThrow;
                theGame.roll(spare);
            }
            else if (pin == "-" ){
                int miss = 0;
                theGame.roll(miss);
                lastThrow = miss;
            }
            else {
                int actualThrow = Integer.parseInt(pin);
                theGame.roll(actualThrow);
                lastThrow = actualThrow;
            }
        }
    }
}