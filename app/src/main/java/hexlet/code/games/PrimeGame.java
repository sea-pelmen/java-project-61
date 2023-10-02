package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeGame {
    public static void prime() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int primeGameNumber = (int) (Math.random() * 100);

            while (primeGameNumber < 1) {
                primeGameNumber = (int) (Math.random() * 100);
            }

            String correctAnswer = null;
            for (int i = 2; i < primeGameNumber; i++) {
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
