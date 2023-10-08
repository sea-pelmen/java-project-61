package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.COUNT_ROUNDS;
import static hexlet.code.Utils.generateRandomNumber;

public class CalcGame {
    static final char[] OPERATIONS = {'+', '-', '*'};

    public static void startGame() {
        String gameRules = "What is the result of the expression?";

        String[][] questionsAndAnswers = Utils.createMassive();

        for (var correctUsersAnswers = 0; correctUsersAnswers < COUNT_ROUNDS; correctUsersAnswers++) {
            int randomOperationIndex = (int) (Math.random() * OPERATIONS.length);
            char randomOperator = OPERATIONS[randomOperationIndex];
            int calcGameNumber1 = Utils.generateRandomNumber();
            int calcGameNumber2 = Utils.generateRandomNumber();
            String calcGameExpression = calcGameNumber1 + " " + randomOperator + " " + calcGameNumber2;
            int correctAnswer = calculate(randomOperator, calcGameNumber1, calcGameNumber2);
            questionsAndAnswers[correctUsersAnswers][0] = calcGameExpression;
            questionsAndAnswers[correctUsersAnswers][1] = String.valueOf(correctAnswer);
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }

    private static int calculate(char randomOperator, int calcGameNumber1, int calcGameNumber2) {
        int correctAnswer = 0;

        switch (randomOperator) {
            case '+':
                correctAnswer = calcGameNumber1 + calcGameNumber2;
                break;
            case '-':
                correctAnswer = calcGameNumber1 - calcGameNumber2;
                break;
            case '*':
                correctAnswer = calcGameNumber1 * calcGameNumber2;
                break;
            default:
                throw new RuntimeException("For operator '" + randomOperator + "' logic is not found.");
        } return correctAnswer;
    }
}
