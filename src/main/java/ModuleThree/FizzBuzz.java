package ModuleThree;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String check(int numberTest) {

        System.out.println(numberTest);

        if (isDivisibleBy3(numberTest)){
            System.out.println(FIZZ);
            return FIZZ;
        }
        else if (isDivisibleBy5(numberTest)){
            System.out.println(BUZZ);
            return BUZZ;
        }
        else if (numberTest % 15 == 0){
            System.out.println(FIZZ_BUZZ);
            return FIZZ_BUZZ;
        }
        return null;
    }

    private boolean isDivisibleBy5(int numberTest) {
        return numberTest % 5 == 0 && numberTest % 3 != 0;
    }

    private boolean isDivisibleBy3(int numberTest) {
        return numberTest % 3 == 0 && numberTest % 5 != 0;
    }
}
