public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String getString() {
        String result = "";
        result = convertNumberToText(result, 3, "Fizz");
        result = convertNumberToText(result, 5, "Buzz");
        if (result.equals(""))
            return Integer.toString(number);
        return result;
    }

    private String convertNumberToText(String result, int number, String text) {
        if (this.number % number == 0) {
            result = text;
        }
        return result;
    }
}
