package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.COUNT_ROUNDS;
import static hexlet.code.Utils.calcRandomNumber;

public class PrimeGame {
    public static void startGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionsAndAnswers = Utils.createMassive();

        for (var correctUsersAnswers = 0; correctUsersAnswers < COUNT_ROUNDS; correctUsersAnswers++) {
            int primeGameNumber = calcRandomNumber();

            while (primeGameNumber < 1) {
                primeGameNumber = calcRandomNumber();
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
            questionsAndAnswers[correctUsersAnswers][0] = String.valueOf(primeGameNumber);
            questionsAndAnswers[correctUsersAnswers][1] = correctAnswer;
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }
}
