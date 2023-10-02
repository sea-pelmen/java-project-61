package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    public static void gcd() {
        String gameRules = "Find the greatest common divisor of given numbers.";

        int questionCount = 3;
        int numberMax = 100;

        String[] questions = new String[questionCount];
        String[] answers = new String[questionCount];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int gcdNumber1 = (int) (Math.random() * numberMax);
            int gcdNumber2 = (int) (Math.random() * numberMax);
            String gcdGameNumbers = gcdNumber1 + " " + gcdNumber2;

            int gcdMax = 0;
            for (int i = 1; i <= gcdNumber1 && i <= gcdNumber2; i++) {
                if (gcdNumber1 % i == 0 && gcdNumber2 % i == 0) {
                    gcdMax = i;
                }
            }
            questions[correctUsersAnswers] = gcdGameNumbers;
            answers[correctUsersAnswers] = String.valueOf(gcdMax);
        }
        Engine.gamesLogic(gameRules, questions, answers);
    }
}
