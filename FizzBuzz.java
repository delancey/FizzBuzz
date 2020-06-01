import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {

    //creating a sequence from each member of our array, passing it as a parameter of our processNumber() and then collect the output and join them together separated by a comma
    public String execute(int[] numbers){
        return Arrays.stream(numbers)
        .mapToObj(this::processNumber)
        .collect(Collectors.joining(", "));
    }

    public String processNumber(int number){
        if (number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        } else if(number % 3 == 0){
            return "Fizz";
        } else if (number % 5 == 0){
            return "Buzz";
        }else {
        return Integer.toString(number);
        }
    }
    
}