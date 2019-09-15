import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FizzBuzz {
    private final int number;
    private Map<Integer, String> conversionRules = new HashMap<Integer, String>();

    public FizzBuzz(int number) {
        this.number = number;
        conversionRules.put(3, "Fizz");
        conversionRules.put(5, "Buzz");
    }

    public String getString() {
        return conversionRules.keySet().stream()
                .map(this::convertNumberToText)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .reduce(FizzBuzz::concatinateTexts)
                .orElse(Integer.toString(number));
    }

    private Optional<String> convertNumberToText(int number) {
        if (this.number % number == 0) {
            return Optional.of(conversionRules.get(number));
        }
        return Optional.empty();
    }

    private static String concatinateTexts(String a, String b) {
        return a + b;
    }
}
