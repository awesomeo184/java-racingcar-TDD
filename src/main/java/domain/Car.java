package domain;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MOVABLE_BOUND = 4;
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 6;

    private final String name;
    private int position = 0;

    public Car(String name) {
        isBlank(name);
        isSoundNameLength(name);
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    private void isBlank(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 잘못된 이름 형식입니다.");
        }
    }

    private void isSoundNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 이름은 " + MAX_NAME_LENGTH + "자 이하여야 합니다.");
        }
    }

    public void move(int number) {
        if (number >= MOVABLE_BOUND) {
            position++;
        }

        if (number < LOWER_BOUND || number > UPPER_BOUND) {
            throw new IllegalArgumentException(
                "[ERROR] 숫자는 " + LOWER_BOUND + "에서 " + UPPER_BOUND + " 사이여야 합니다."
            );
        }
    }

}
