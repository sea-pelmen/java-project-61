package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUNDS = 3;
    public static void runGame(String gameRules, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameRules);

        for (int correctUsersAnswers = 0; correctUsersAnswers < COUNT_ROUNDS; correctUsersAnswers++) {

            System.out.println("Question: " + questionsAndAnswers[correctUsersAnswers][0]);
            System.out.print("Your answer: ");

            var usersAnswer = scanner.next();
            if (questionsAndAnswers[correctUsersAnswers][1].equals(usersAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usersAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[correctUsersAnswers][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

            System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
