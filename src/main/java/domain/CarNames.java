package domain;

import java.util.Arrays;
import java.util.List;

public class CarNames {

    private static final String DELIMITER = ",";
    private final List<String> names;

    public CarNames(String names) {
        this.names = split(names);
    }

    private List<String> split(String names) {
        return Arrays.asList(names.split(DELIMITER));
    }

    public List<String> getNames() {
        return names;
    }
}
