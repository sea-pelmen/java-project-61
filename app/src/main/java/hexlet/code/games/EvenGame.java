package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    static final int QUESTION_COUNT = 3;
    static final int NUMBER_MAX = 100;
    public static void startGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionsAndAnswers = new String[QUESTION_COUNT][2];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            String evenGameNumber = String.valueOf((int) (Math.random() * NUMBER_MAX));
            String correctAnswer = (Integer.parseInt(evenGameNumber) % 2 == 0) ? "yes" : "no";
            questionsAndAnswers[correctUsersAnswers][0] = evenGameNumber;
            questionsAndAnswers[correctUsersAnswers][1] = correctAnswer;
        }

        Engine.gamesLogic(gameRules, questionsAndAnswers);
    }
}
