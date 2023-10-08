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
            String progressionFirstNumber = String.valueOf(generateRandomNumber());
            int progressionStep = Utils.generateRandomNumber();
            String[] progressionNumbers = createProgression(progressionLength, progressionFirstNumber, progressionStep);

            int randomQuestionIndex = (int) (Math.random() * progressionNumbers.length - 1);
            int randomD = Integer.parseInt(progressionNumbers[1]) - Integer.parseInt(progressionNumbers[0]);
            String correctAnswer =
                    String.valueOf(Integer.parseInt(progressionNumbers[randomQuestionIndex + 1]) - randomD);
            progressionNumbers[randomQuestionIndex] = "..";
            String progressionQuestion = Arrays.toString(progressionNumbers);
            progressionQuestion = progressionQuestion.replace("[", "").replace("]", "").replace(",", "");
            questionsAndAnswers[correctUsersAnswers][0] = progressionQuestion;
            questionsAndAnswers[correctUsersAnswers][1] = correctAnswer;
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }

    private static String[] createProgression(int progressionLength,
                                              String progressionFirstNumber,
                                              int progressionStep) {
        String[] progressionNumbers = new String[progressionLength];
        progressionNumbers[0] = progressionFirstNumber;

        for (int i = 1; i < progressionNumbers.length; i++) {
            progressionNumbers[i] = String.valueOf((Integer.parseInt(progressionNumbers[i - 1]) + progressionStep));
        }
        return progressionNumbers;
    }
}
