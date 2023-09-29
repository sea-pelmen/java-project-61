package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    public static void calc() {
        String gameRules = "What is the result of the expression?";

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            char[] operations = {'+', '-', '*'};
            int randomOperationIndex = (int) (Math.random() * operations.length);
            char randomOperator = operations[randomOperationIndex];
            int calcGameNumber1 = (int) (Math.random() * 100);
            int calcGameNumber2 = (int) (Math.random() * 100);
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
            }

            questions[correctUsersAnswers] = calcGameExpression;
            answers[correctUsersAnswers] = String.valueOf(correctAnswer);
        }

        Engine.gamesLogic(gameRules, questions, answers);

    }
}
