import static org.assertj.core.api.Assertions.*;

import domain.Car;
import domain.CarFactory;
import domain.CarNames;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarFactoryTest {

    @Test
    @DisplayName("CarNames가 주어지면 차 객체를 잘 생성하는가")
    void makeCars() {
        CarNames carNames = new CarNames("car1,car2,car3");
        List<Car> cars = CarFactory.makeCars(carNames);
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("한 회차를 잘 진행하는가")
    void runPhase() {
        CarNames carNames = new CarNames("car1,car2,car3");
        CarFactory.makeCars(carNames);
        CarFactory.runPhase();
    }

}
