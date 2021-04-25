package ModuleThree;

public class BowlingKata {

    int [] rolls = new int[21];
    int roll;

     public int getScore(){
         int cursor = 0;
         int score = 0;

         for (int roll = 0; roll < rolls.length; roll++) {
             if (isSpare(cursor)){
                 score += 10 + rolls[cursor+2];
                 cursor ++;
                 roll++;
             }
             else{
                 score += rolls[roll];
                 cursor ++;
             }
         }
         return score;
     }

    private boolean isSpare(int cursor) {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }

    public void roll(int pins){
         rolls[roll++] += pins;
     }
}
