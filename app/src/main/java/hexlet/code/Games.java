package hexlet.code;

import java.util.Scanner;

public class Games {
    public static void even() {

        String userName = Cli.greeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);

        for (var correctUsersAnswers = 0; correctUsersAnswers <= 2; correctUsersAnswers++) {
            int evenGameNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + evenGameNumber);
            System.out.print("Your answer: ");

            var usersEvenGameAnswer = scanner.next();
            String correctAnswer = (evenGameNumber % 2 == 0) ? "yes" : "no";
            if (correctAnswer.equals(usersEvenGameAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usersEvenGameAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName);
                break;
            }
            if (correctUsersAnswers == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
