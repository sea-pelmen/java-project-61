package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.COUNT_ROUNDS;

public class PrimeGame {
    public static void startGame() {
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] questionsAndAnswers = Utils.createMassive();

        for (var correctUsersAnswers = 0; correctUsersAnswers < COUNT_ROUNDS; correctUsersAnswers++) {
            int primeGameNumber = Utils.generateRandomNumber();

            while (primeGameNumber < 1) {
                primeGameNumber = Utils.generateRandomNumber();
            }
            String correctAnswer = isPrime(primeGameNumber) ? "yes" : "no";
            questionsAndAnswers[correctUsersAnswers][0] = String.valueOf(primeGameNumber);
            questionsAndAnswers[correctUsersAnswers][1] = correctAnswer;
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }

    private static boolean isPrime(int primeGameNumber) {
        if (primeGameNumber < 2) {
            return false;
        }
        for (int i = 2; i < primeGameNumber; i++) {
            if (primeGameNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}


