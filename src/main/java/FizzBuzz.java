public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String getString() {
        if (number == 3) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
