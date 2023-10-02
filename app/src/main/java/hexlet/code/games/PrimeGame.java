package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    public static void prime() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        int questionCount = 3;
        int numberMax = 100;

        String[] questions = new String[questionCount];
        String[] answers = new String[questionCount];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int primeGameNumber = (int) (Math.random() * numberMax);

            while (primeGameNumber < 1) {
                primeGameNumber = (int) (Math.random() * numberMax);
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
