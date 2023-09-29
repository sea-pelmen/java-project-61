package hexlet.code;

import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        var usersChoice = Integer.parseInt(scanner.next());

        switch (usersChoice) {
            case 1 -> Cli.greeting();
            case 2 -> EvenGame.even();

            case 0 -> System.out.println("Bye!");
            default -> System.out.println("Invalid game number. Please restart the app.");
        }
    }
}
