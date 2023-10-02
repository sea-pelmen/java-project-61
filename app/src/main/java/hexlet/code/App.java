package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        var usersChoice = Integer.parseInt(scanner.next());

        switch (usersChoice) {
            case 1 -> Cli.greeting();
            case 2 -> EvenGame.even();
            case 3 -> CalcGame.calc();
            case 4 -> GCDGame.gcd();
            case 5 -> ProgressionGame.progression();
            case 6 -> PrimeGame.prime();
            case 0 -> System.out.println("Bye!");
            default -> System.out.println("Invalid game number. Please restart the app.");
        }
    }
}
