package domain;

import java.util.Arrays;
import java.util.List;

public class CarNames {

    private static final String DELIMITER = ",";
    private final List<String> names;

    public CarNames(String names) {
        isNullOrBlank(names);
        this.names = split(names);
        isValidNameLength(this.names);
    }

    private void isValidNameLength(List<String> names) {
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("[ERROR 자동차의 이름은 5자 이하여야 합니다.]");
            }
        }
    }

    private void isNullOrBlank(String names) {
        if (names == null || names.isBlank()) {
            throw new IllegalArgumentException("[ERROR 잘못된 입력입니다]");
        }
    }

    private List<String> split(String names) {
        return Arrays.asList(names.split(DELIMITER));
    }

    public List<String> getNames() {
        return names;
    }
}
