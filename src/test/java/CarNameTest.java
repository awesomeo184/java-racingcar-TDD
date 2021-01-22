import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import domain.CarNames;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarNameTest {

    @Test
    @DisplayName("입력된 이름이 Null 혹은 빈칸일 때 오류 발생")
    void isNullOrBlank() {
        assertThrows(IllegalArgumentException.class, () -> new CarNames(null));
        assertThrows(IllegalArgumentException.class, () -> new CarNames(""));
        assertThrows(IllegalArgumentException.class, () -> new CarNames(" "));
    }

    @Test
    @DisplayName("이름을 잘 나누는지")
    void splitName() {
        CarNames carNames = new CarNames("Jack,Pobi,Crong");
        assertThat(carNames.getNames().size()).isEqualTo(3);
    }

}
