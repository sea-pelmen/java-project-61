package hexlet.code;

import static hexlet.code.Engine.COUNT_ROUNDS;

public class Utils {
    static final int NUMBER_MAX = 100;

    public static int generateRandomNumber() {
        return (int) (Math.random() * NUMBER_MAX);
    }
    public static String[][] createMassive() {
        return new String[COUNT_ROUNDS][2];
    }
}
