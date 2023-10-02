package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    static final int QUESTION_COUNT = 3;
    static final int NUMBER_MAX = 100;
    public static void prime() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questions = new String[QUESTION_COUNT];
        String[] answers = new String[QUESTION_COUNT];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int primeGameNumber = (int) (Math.random() * NUMBER_MAX);

            while (primeGameNumber < 1) {
                primeGameNumber = (int) (Math.random() * NUMBER_MAX);
            }

            String correctAnswer = null;
            for (int i = 2; i <= primeGameNumber; i++) {
                if (i == primeGameNumber) {
                    correctAnswer = "yes";
                    break;
                }
                correctAnswer = (primeGameNumber % i == 0) ? "no" : "yes";
                if (correctAnswer.equals("no")) {
                    break;
                }
            }
            questions[correctUsersAnswers] = String.valueOf(primeGameNumber);
            answers[correctUsersAnswers] = correctAnswer;
        }
        Engine.gamesLogic(gameRules, questions, answers);
    }
}
