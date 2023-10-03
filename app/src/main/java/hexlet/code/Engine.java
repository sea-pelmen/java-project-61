package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void gamesLogic(String gameRules, String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameRules);

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            System.out.println("Question: " + questions[correctUsersAnswers]);
            System.out.print("Your answer: ");

            var usersAnswer = scanner.next();
            if (answers[correctUsersAnswers].equals(usersAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usersAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + answers[correctUsersAnswers] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            if (correctUsersAnswers == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
        scanner.close();
    }
}
