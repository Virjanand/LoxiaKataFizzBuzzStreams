import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenFizzBuzzing {

    private FizzBuzz fizzbuzz;

    @Test
    void returnStringForNumber() {
        assertFizzbuzzReturnsTextForNumber();
    }

    private void assertFizzbuzzReturnsTextForNumber() {
        fizzbuzz = new FizzBuzz(1);
        assertThat(fizzbuzz.getString()).isEqualTo("1");
    }
}
