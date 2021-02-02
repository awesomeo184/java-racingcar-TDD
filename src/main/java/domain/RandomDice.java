package domain;

import java.util.Random;

public class RandomDice {
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 6;
    private static final Random RANDOM = new Random();

    private RandomDice() {
    }

    public static int roll() {
        return LOWER_BOUND + RANDOM.nextInt(UPPER_BOUND - LOWER_BOUND + 1);
    }

}
