public class FizzBuzz {
    public void execute(){
        
    }

    public String processNumber(int number){
        if (number % 3 == 0){
            return "Fizz";
        } else if (number == 5){
            return "Buzz";
        }else {
        return Integer.toString(number);
        }
    }
    
}