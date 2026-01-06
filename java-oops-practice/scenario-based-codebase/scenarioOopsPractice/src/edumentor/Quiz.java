package edumentor;

import java.util.List;

public class Quiz {

    private List<String> questions;
    private final List<String> correctAnswers; // Encapsulation (cannot be modified)
    private int score;
    private int difficultyLevel; // 1 = Easy, 2 = Medium, 3 = Hard

    public Quiz(List<String> questions, List<String> correctAnswers, int difficultyLevel) {
        this.questions = questions;
        this.correctAnswers = correctAnswers;
        this.difficultyLevel = difficultyLevel;
        this.score = 0;
    }

    // Quiz evaluation
    public void attemptQuiz(List<String> userAnswers) {
        for (int i = 0; i < correctAnswers.size(); i++) {
            if (correctAnswers.get(i).equalsIgnoreCase(userAnswers.get(i))) {
                // Difficulty-based scoring
                if (difficultyLevel == 1) {
                    score += 1;       
                } else if (difficultyLevel == 2) {
                    score += 2;       
                } else if (difficultyLevel == 3) {
                    score += 3;
                }
            }
        }
    }

    // Percentage calculation using operators
    public double calculatePercentage() {
        int maxScore = questions.size() *
                (difficultyLevel == 1 ? 1 : difficultyLevel == 2 ? 2 : 3);

        return (score * 100.0) / maxScore;
    }

    public int getScore() {
        return score;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }
}
