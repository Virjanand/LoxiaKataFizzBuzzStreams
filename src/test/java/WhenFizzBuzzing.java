import org.junit.jupiter.api.Test;

import java.util.ResourceBundle;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenFizzBuzzing {
    @Test
    void returnStringForNumber() {
        FizzBuzz fizzbuzz = new FizzBuzz(1);
        assertThat(fizzbuzz.getString()).isEqualTo("1");
    }
}
