public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String getString() {
        String result = "";
        if (number == 3) {
            result = "Fizz";
        }
        if (number == 5) {
            result = "Buzz";
        }
        if (result.equals(""))
            return Integer.toString(number);
        return result;
    }
}
