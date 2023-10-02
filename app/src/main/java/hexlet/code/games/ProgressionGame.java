package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class ProgressionGame {
    static final int QUESTION_COUNT = 3;
    static final int NUMBER_MAX = 100;
    static final int MIN = 5;
    static final int MAX = 10;

    public static void progression() {
        String gameRules = "What number is missing in the progression?";

        String[] questions = new String[QUESTION_COUNT];
        String[] answers = new String[QUESTION_COUNT];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int randomNum = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
            String[] progressionNumbers = new String[randomNum];
            int randomQuestionIndex = (int) (Math.random() * progressionNumbers.length - 1);

            progressionNumbers[0] = String.valueOf((int) (Math.random() * NUMBER_MAX));

            int randomD = (int) (Math.random() * NUMBER_MAX);

            for (int i = 1; i < progressionNumbers.length; i++) {
                progressionNumbers[i] = String.valueOf((Integer.parseInt(progressionNumbers[i - 1]) + randomD));
            }

            String correctAnswer =
                    String.valueOf(Integer.parseInt(progressionNumbers[randomQuestionIndex + 1]) - randomD);
            progressionNumbers[randomQuestionIndex] = "..";
            String progressionQuestion = Arrays.toString(progressionNumbers);
            progressionQuestion = progressionQuestion.replace("[", "").replace("]", "").replace(",", "");
            questions[correctUsersAnswers] = progressionQuestion;
            answers[correctUsersAnswers] = correctAnswer;
        }
        Engine.gamesLogic(gameRules, questions, answers);
    }
}
