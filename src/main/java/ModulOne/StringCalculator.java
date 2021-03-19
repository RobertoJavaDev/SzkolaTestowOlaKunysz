package ModulOne;

public class StringCalculator {

    int add(String input) {

        if (input.isEmpty()) {
            return 0;
        }

        String[] numbers = input.split(",");

        if (numbers.length == 1) {
            String number = numbers[0];
            return getIntFrom(number);
        }
        return getIntFrom(numbers[0] + numbers[1]);
    }

    private int getIntFrom(String number) {
        return Integer.parseInt(number);
    }
}

