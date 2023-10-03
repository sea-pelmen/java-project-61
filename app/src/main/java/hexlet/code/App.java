package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    static final int GREETING_NUMBER = 1;
    static final int EVEN_GAME_NUMBER = 2;
    static final int CALC_GAME_NUMBER = 3;
    static final int GCD_GAME_NUMBER = 4;
    static final int PROGRESSION_GAME_NUMBER = 5;
    static final int PRIME_GAME_NUMBER = 6;
    static final int EXIT_NUMBER = 0;
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
            case GREETING_NUMBER -> Cli.greeting();
            case EVEN_GAME_NUMBER -> EvenGame.startGame();
            case CALC_GAME_NUMBER -> CalcGame.startGame();
            case GCD_GAME_NUMBER -> GCDGame.startGame();
            case PROGRESSION_GAME_NUMBER -> ProgressionGame.startGame();
            case PRIME_GAME_NUMBER -> PrimeGame.startGame();
            case EXIT_NUMBER -> System.out.println("Bye!");
            default -> System.out.println("Invalid game number. Please restart the app.");
        }
    }
}
