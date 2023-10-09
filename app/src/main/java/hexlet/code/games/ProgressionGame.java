package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

import static hexlet.code.Engine.COUNT_ROUNDS;
import static hexlet.code.Utils.generateRandomNumber;

public class ProgressionGame {
    static final int MIN = 5;
    static final int MAX = 10;

    public static void startGame() {
        String gameRules = "What number is missing in the progression?";

        String[][] questionsAndAnswers = Utils.createMassive();

        for (var correctUsersAnswers = 0; correctUsersAnswers < COUNT_ROUNDS; correctUsersAnswers++) {
            int progressionLength = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
            int progressionFirstNumber = generateRandomNumber();
            int progressionStep = Utils.generateRandomNumber();
            int[] progressionNumbers = createProgression(progressionLength, progressionFirstNumber, progressionStep);

            String[] progressionQuestionMassive = new String[progressionLength];

            for (int i = 0; i < progressionQuestionMassive.length; i++) {
                progressionQuestionMassive[i] = String.valueOf(progressionNumbers[i]);
            }

            int randomQuestionIndex = (int) (Math.random() * progressionNumbers.length - 1);
            int randomD = progressionNumbers[1] - progressionNumbers[0];
            String correctAnswer =
                    String.valueOf(progressionNumbers[randomQuestionIndex + 1] - randomD);
            progressionQuestionMassive[randomQuestionIndex] = "..";
            String progressionQuestion = Arrays.toString(progressionQuestionMassive);
            progressionQuestion = progressionQuestion.replace("[", "")
                    .replace("]", "")
                    .replace(",", "");
            questionsAndAnswers[correctUsersAnswers][0] = progressionQuestion;
            questionsAndAnswers[correctUsersAnswers][1] = correctAnswer;
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }

    private static int[] createProgression(int progressionLength,
                                              int progressionFirstNumber,
                                              int progressionStep) {
        int[] progressionNumbers = new int[progressionLength];
        progressionNumbers[0] = progressionFirstNumber;

        for (int i = 1; i < progressionNumbers.length; i++) {
            progressionNumbers[i] = progressionNumbers[i - 1] + progressionStep;
        }
        return progressionNumbers;
    }
}
