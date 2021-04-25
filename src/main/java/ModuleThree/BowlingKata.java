package ModuleThree;

public class BowlingKata {

    int [] rolls = new int[21];
    int roll;

     public int getScore(){
         int cursor = 0;
         int score = 0;

         for (int i = 0; i < 20; i++) {
             if (rolls[cursor] + rolls[cursor+1] == 10){
                 score += 10 + rolls[cursor+2];
                 cursor += 2;
                 i++;
             }
             else{
                 score += rolls[i];
                 cursor ++;
             }
         }
         return score;
     }

     public void roll(int pins){
         rolls[roll++] += pins;
     }

}
