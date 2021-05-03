package ModuleThree;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String check(int numberTest) {

        System.out.println(numberTest);

        if (numberTest % 3 == 0){
            System.out.println(FIZZ);
            return FIZZ;
        }
        else if (numberTest % 5 == 0){
            System.out.println(BUZZ);
            return BUZZ;
        }
        return null;
    }
}
