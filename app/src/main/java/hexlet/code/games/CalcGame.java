package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    static final int QUESTION_COUNT = 3;
    static final int NUMBER_MAX = 100;
    public static void startGame() {
        String gameRules = "What is the result of the expression?";

        String[] questions = new String[QUESTION_COUNT];
        String[] answers = new String[QUESTION_COUNT];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            char[] operations = {'+', '-', '*'};
            int randomOperationIndex = (int) (Math.random() * operations.length);
            char randomOperator = operations[randomOperationIndex];
            int calcGameNumber1 = (int) (Math.random() * NUMBER_MAX);
            int calcGameNumber2 = (int) (Math.random() * NUMBER_MAX);
            String calcGameExpression = calcGameNumber1 + " " + randomOperator + " " + calcGameNumber2;

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
                    correctAnswer = 0;
            }
            questions[correctUsersAnswers] = calcGameExpression;
            answers[correctUsersAnswers] = String.valueOf(correctAnswer);
        }
        Engine.gamesLogic(gameRules, questions, answers);
    }
}
