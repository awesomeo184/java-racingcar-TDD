package domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static List<Car> makeCars(CarNames names) {
        List<Car> cars = new ArrayList<>();
        List<String> nameList = names.getNames();

        for (String name : nameList) {
            cars.add(new Car(name));
        }
        return cars;
    }
}
