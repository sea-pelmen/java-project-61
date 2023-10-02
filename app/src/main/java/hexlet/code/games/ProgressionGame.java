package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class ProgressionGame {
    public static void progression() {
        String gameRules = "What number is missing in the progression?";

        int questionCount = 3;
        int numberMax = 100;

        String[] questions = new String[questionCount];
        String[] answers = new String[questionCount];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int min = 5;
            int max = 10;
            int randomNum = min + (int) (Math.random() * ((max - min) + 1));
            String[] progressionNumbers = new String[randomNum];
            int randomQuestionIndex = (int) (Math.random() * progressionNumbers.length - 1);

            progressionNumbers[0] = String.valueOf((int) (Math.random() * numberMax));

            int randomD = (int) (Math.random() * numberMax);

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
