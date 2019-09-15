public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
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
