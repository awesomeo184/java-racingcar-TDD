package domain;

public class Car {
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
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름은 5자 이하여야 합니다.");
        }
    }

    public void move(int number) {
        if (number > 3) {
            position++;
        }

        if (number < 1 || number > 6) {
            throw new IllegalArgumentException("[ERROR] 숫자는 1에서 6 사이여야 합니다.");
        }
    }

}
