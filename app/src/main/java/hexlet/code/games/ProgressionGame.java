package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class ProgressionGame {
    public static void progression() {
        String gameRules = "What number is missing in the progression?";

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int min = 5;
            int max = 10;
            int randomNum = min + (int) (Math.random() * ((max - min) + 1));
            String[] progressionNumbers = new String[randomNum];
            int randomQuestionIndex = (int) (Math.random() * progressionNumbers.length - 1);

            progressionNumbers[0] = String.valueOf((int) (Math.random() * 100));

            int randomD = (int) (Math.random() * 100);

            for (int i = 1; i < progressionNumbers.length; i++) {
                progressionNumbers[i] = String.valueOf((Integer.parseInt(progressionNumbers[i - 1]) + randomD));
            }

            String correctAnswer =
                    String.valueOf(Integer.parseInt(progressionNumbers[randomQuestionIndex + 1]) - randomD);
            progressionNumbers[randomQuestionIndex] = "..";
            String progressionQuestion = Arrays.toString(progressionNumbers);
            progressionQuestion = progressionQuestion.replace("[", "").replace("]", "");
            questions[correctUsersAnswers] = progressionQuestion;
            answers[correctUsersAnswers] = correctAnswer;
        }
        Engine.gamesLogic(gameRules, questions, answers);
    }
}
