package score;

public class Score {
    private int totalScore;

    public Score() {
        this.totalScore = 0;
    }

    public void addPoints(int points) {
        totalScore += points;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
