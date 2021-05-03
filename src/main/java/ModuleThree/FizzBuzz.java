package ModuleThree;

public class FizzBuzz {

    public String check(int numberTest) {

        System.out.println(numberTest);

        if (numberTest % 3 == 0){

            System.out.println("Fizz");
            return "Fizz";
        }
        return null;
    }
}
