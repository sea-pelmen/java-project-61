package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.COUNT_ROUNDS;

public class GCDGame {
    public static void startGame() {
        String gameRules = "Find the greatest common divisor of given numbers.";

        String[][] questionsAndAnswers = Utils.createMassive();

        for (var correctUsersAnswers = 0; correctUsersAnswers < COUNT_ROUNDS; correctUsersAnswers++) {
            int gcdNumber1 = Utils.generateRandomNumber();
            int gcdNumber2 = Utils.generateRandomNumber();
            String gcdGameNumbers = gcdNumber1 + " " + gcdNumber2;

            int gcdMax = findGCD(gcdNumber1, gcdNumber2);
            questionsAndAnswers[correctUsersAnswers][0] = gcdGameNumbers;
            questionsAndAnswers[correctUsersAnswers][1] = String.valueOf(gcdMax);
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }

    private static int findGCD(int gcdNumber1, int gcdNumber2) {
        int gcdMax = 0;
        if (gcdNumber1 == 0 || gcdNumber2 == 0) {
            return Math.max(gcdNumber1, gcdNumber2);
        }
        for (int i = 1; i <= gcdNumber1 && i <= gcdNumber2; i++) {
            if (gcdNumber1 % i == 0 && gcdNumber2 % i == 0) {
                gcdMax = i;
            }
        }
        return gcdMax;
    }
}
