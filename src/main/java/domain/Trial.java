package domain;

public class Trial {

    private final int value;

    public Trial(String input) {
        value = Integer.parseInt(input);
        checkPositive(value);
    }

    public int getValue() {
        return value;
    }

    private void checkPositive(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("[ERROR] 시도횟수는 1 이상이어야 합니다.");
        }
    }
}
