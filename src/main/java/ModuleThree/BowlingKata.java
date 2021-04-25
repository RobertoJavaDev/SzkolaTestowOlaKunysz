package ModuleThree;

public class BowlingKata {
    int score = 0;

     public int getScore(){
         return score;
     }

     public void roll(int pins){
         score += pins;
     }

}
