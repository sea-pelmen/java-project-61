package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    public static void even() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            String evenGameNumber = String.valueOf((int) (Math.random() * 100));
            String correctAnswer = (Integer.parseInt(evenGameNumber) % 2 == 0) ? "yes" : "no";
            questions[correctUsersAnswers] = evenGameNumber;
            answers[correctUsersAnswers] = correctAnswer;
        }

        Engine.gamesLogic(gameRules, questions, answers);

    }
}
