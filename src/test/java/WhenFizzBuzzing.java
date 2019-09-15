import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenFizzBuzzing {

    private FizzBuzz fizzbuzz;

    @Test
    void returnStringForNumber() {
        assertFizzbuzzReturnsTextForNumber("1", 1);
        assertFizzbuzzReturnsTextForNumber("2", 2);
    }

    @Test
    void returnFizzFor3() {
        assertFizzbuzzReturnsTextForNumber("Fizz", 3);
    }

    private void assertFizzbuzzReturnsTextForNumber(String text, int number) {
        fizzbuzz = new FizzBuzz(number);
        assertThat(fizzbuzz.getString()).isEqualTo(text);
    }
}
