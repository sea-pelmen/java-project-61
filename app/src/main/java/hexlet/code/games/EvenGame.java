package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.COUNT_ROUNDS;

public class EvenGame {

    public static void startGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionsAndAnswers = Utils.createMassive();

        for (var correctUsersAnswers = 0; correctUsersAnswers < COUNT_ROUNDS; correctUsersAnswers++) {
            int evenGameNumber = Utils.generateRandomNumber();
            String correctAnswer = isEven(evenGameNumber) ? "yes" : "no";
            questionsAndAnswers[correctUsersAnswers][0] = String.valueOf(evenGameNumber);
            questionsAndAnswers[correctUsersAnswers][1] = correctAnswer;
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }

    private static boolean isEven(int evenGameNumber) {
        return evenGameNumber % 2 == 0;
    }
}
