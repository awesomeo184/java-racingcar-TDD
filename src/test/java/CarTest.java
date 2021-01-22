import static org.assertj.core.api.Assertions.*;

import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CarTest {

    @ParameterizedTest
    @DisplayName("잘못된 이름으로 차를 생성하려는 경우")
    @ValueSource(strings = {"", "  "})
    void blankName(String name) {
        assertThatThrownBy(() -> {
            new Car(name);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("잘못된 이름");
    }

    @ParameterizedTest
    @DisplayName("정상적인 차 이름의 경우")
    @ValueSource(strings = {"abcde", "12345", "가나다"})
    void correctName(String name) {
        assertThat(new Car(name).getName()).isEqualTo(name);
    }

    @ParameterizedTest
    @DisplayName("차 이름이 다섯 자를 초과하는 경우 오류 발생")
    @ValueSource(strings = {"abcdef", "123456", "가나다라마바"})
    void tooLongName(String name) {
        assertThatThrownBy(() -> {
            new Car(name);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("5자");
    }

}
