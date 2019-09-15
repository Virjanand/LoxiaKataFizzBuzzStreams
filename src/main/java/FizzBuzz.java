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
        String result = "";
        for (int rule : conversionRules.keySet()) {
            result += convertNumberToText(rule);
        }
        if (result.equals(""))
            return Integer.toString(number);
        return result;
    }

    private Optional<String> convertNumberToText(int number) {
        if (this.number % number == 0) {
            return Optional.of(conversionRules.get(number));
        }
        return Optional.empty();
    }
}
