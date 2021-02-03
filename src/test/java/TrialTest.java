import static org.assertj.core.api.Assertions.*;

import domain.Trial;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TrialTest {

    @Test
    @DisplayName("정상 입력의 경우 숫자가 잘 파싱되는지")
    void normalInput() {
        Trial t = new Trial("10");
        assertThat(t.getValue()).isEqualTo(10);
    }

    @ParameterizedTest
    @DisplayName("0 또는 음수 입력")
    @ValueSource(strings = {"-1", "0"})
    void invalidValue(String value) {
        assertThatThrownBy(() -> {
            new Trial(value);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("공백을 입력하는 경우")
    @ValueSource(strings = {"", "  ", "          "})
    void blankValue(String value) {
        assertThatThrownBy(() -> {
            new Trial(value);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("숫자 형태가 아닌 문자 입력")
    void nonNumericInput() {
        assertThatThrownBy(() -> {
            new Trial("일");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
