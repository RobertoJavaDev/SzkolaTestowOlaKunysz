package ModuleThree;

public class BowlingKata {

    int [] rolls = new int[21];
    int roll =0;
    int cursor = 0;

     public int getScore(){

         int score = 0;

         for (int frame = 0; frame < 10; frame++) {
             if (isSpare()){
                 score += 10 + rolls[cursor+2];
                 cursor +=2;
             }
             else if (isStrike()){
                 score += 10 + rolls[cursor+1] + rolls[cursor+2];
                 cursor ++;
             }
             else{
                 score += rolls[cursor] + rolls[cursor+1];
                 cursor +=2;
             }
         }
         return score;
     }

    private boolean isStrike() {
        return rolls[cursor] == 10;
    }

    private boolean isSpare() {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }

    public void roll(int pins){
         rolls[roll++] += pins;
     }
}
