package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class EvenGame {
    public static void even() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        int[] questions = new int[3];
        String[] answers = new String[3];

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int evenGameNumber = (int) (Math.random() * 100);
            String correctAnswer = (evenGameNumber % 2 == 0) ? "yes" : "no";
            questions[correctUsersAnswers] = evenGameNumber;
            answers[correctUsersAnswers] = correctAnswer;
        }

        Engine.gamesLogic(gameRules, questions, answers);

    }
}
