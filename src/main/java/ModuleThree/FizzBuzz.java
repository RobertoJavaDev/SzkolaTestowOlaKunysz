package ModuleThree;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String check(int numberTest) {

        System.out.println(numberTest);
        String result = "";

        if (isDivisibleBy3(numberTest)){
            System.out.println(FIZZ);
            result += FIZZ;
        }
        else if (isDivisibleBy5(numberTest)){
            System.out.println(BUZZ);
            result += BUZZ;
        }
        else if (numberTest % 15 == 0){
            System.out.println(FIZZ_BUZZ);
            result += FIZZ_BUZZ;
        }
        return result.isEmpty() ? String.valueOf(numberTest) : result;
    }

    private boolean isDivisibleBy5(int numberTest) {
        return numberTest % 5 == 0 && numberTest % 3 != 0;
    }

    private boolean isDivisibleBy3(int numberTest) {
        return numberTest % 3 == 0 && numberTest % 5 != 0;
    }

    public void generateNumber() {
        for (int i = 1; i < 101; i++) {
            check(i);
        }
    }
}
