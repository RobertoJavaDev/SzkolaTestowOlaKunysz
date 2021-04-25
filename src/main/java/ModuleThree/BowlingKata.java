package ModuleThree;

public class BowlingKata {
    int score = 0;

    public int add(int roll, int pins) {
        for (int i = 0; i <roll; i++) {
            score += pins;
        }
        return score;
    }
}
