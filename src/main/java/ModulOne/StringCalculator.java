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
        }else
        return getIntFrom(numbers[0]) + getIntFrom(numbers[1]) + getIntFrom(numbers[2]) + getIntFrom(numbers[3]);
    }

    private int getIntFrom(String number) {
        return Integer.parseInt(number);
    }
}

