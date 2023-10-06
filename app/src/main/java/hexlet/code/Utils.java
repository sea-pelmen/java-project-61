package hexlet.code;

public class Utils {
    static final int NUMBER_MAX = 100;
    static final int QUESTION_COUNT = 3;
    public static int calcRandomNumber() {
        return (int) (Math.random() * NUMBER_MAX);
    }
    public static String[][] createMassive() {
        return new String[QUESTION_COUNT][2];
    }
}
