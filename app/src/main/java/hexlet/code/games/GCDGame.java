package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    static final int QUESTION_COUNT = 3;
    static final int NUMBER_MAX = 100;
    public static void startGame() {
        String gameRules = "Find the greatest common divisor of given numbers.";

        String[][] questionsAndAnswers = new String[QUESTION_COUNT][2];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int gcdNumber1 = (int) (Math.random() * NUMBER_MAX);
            int gcdNumber2 = (int) (Math.random() * NUMBER_MAX);
            String gcdGameNumbers = gcdNumber1 + " " + gcdNumber2;

            int gcdMax = 0;
            for (int i = 1; i <= gcdNumber1 && i <= gcdNumber2; i++) {
                if (gcdNumber1 % i == 0 && gcdNumber2 % i == 0) {
                    gcdMax = i;
                }
            }
            questionsAndAnswers[correctUsersAnswers][0] = gcdGameNumbers;
            questionsAndAnswers[correctUsersAnswers][1] = String.valueOf(gcdMax);
        }
        Engine.gamesLogic(gameRules, questionsAndAnswers);
    }
}
