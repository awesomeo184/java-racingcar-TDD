package domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    private static final List<Car> cars = new ArrayList<>();

    public static List<Car> makeCars(CarNames names) {
        List<String> nameList = names.getNames();

        for (String name : nameList) {
            cars.add(new Car(name));
        }
        return cars;
    }
}
