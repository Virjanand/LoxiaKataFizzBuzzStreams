import java.util.HashMap;
import java.util.Map;

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
        result += convertNumberToText(3, "Fizz");
        result += convertNumberToText(5, "Buzz");
        if (result.equals(""))
            return Integer.toString(number);
        return result;
    }

    private String convertNumberToText(int number, String text) {
        if (this.number % number == 0) {
            return text;
        }
        return "";
    }
}
