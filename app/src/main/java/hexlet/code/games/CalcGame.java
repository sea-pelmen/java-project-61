package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    public static void calc() {
        String gameRules = "What is the result of the expression?";

        int questionCount = 3;
        int numberMax = 100;

        String[] questions = new String[questionCount];
        String[] answers = new String[questionCount];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            char[] operations = {'+', '-', '*'};
            int randomOperationIndex = (int) (Math.random() * operations.length);
            char randomOperator = operations[randomOperationIndex];
            int calcGameNumber1 = (int) (Math.random() * numberMax);
            int calcGameNumber2 = (int) (Math.random() * numberMax);
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
