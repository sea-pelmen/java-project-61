package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    static final int QUESTION_COUNT = 3;
    static final int NUMBER_MAX = 100;
    public static void startGame() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[QUESTION_COUNT];
        String[] answers = new String[QUESTION_COUNT];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            String evenGameNumber = String.valueOf((int) (Math.random() * NUMBER_MAX));
            String correctAnswer = (Integer.parseInt(evenGameNumber) % 2 == 0) ? "yes" : "no";
            questions[correctUsersAnswers] = evenGameNumber;
            answers[correctUsersAnswers] = correctAnswer;
        }

        Engine.gamesLogic(gameRules, questions, answers);
    }
}
