import static org.assertj.core.api.Assertions.*;

import domain.Car;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MoveTest {

    @Test
    @DisplayName("조건에 맞춰 잘 움직이는지")
    void move() {
        Car car = new Car("test");
        assertThat(car.getPosition()).isEqualTo(0);
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
        car.move(5);
        assertThat(car.getPosition()).isEqualTo(2);
        car.move(6);
        assertThat(car.getPosition()).isEqualTo(3);
    }

}
