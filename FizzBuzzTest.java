import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void test(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.execute(new int[]{ 1}));
    }

    @Test
    public void shouldProcessInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();        
        assertEquals("1", fizzBuzz.processNumber(1));
        assertEquals("2", fizzBuzz.processNumber(2));
        assertEquals("Fizz", fizzBuzz.processNumber(3));
        assertEquals("Buzz", fizzBuzz.processNumber(5));
        assertEquals("Fizz", fizzBuzz.processNumber(6));
        assertEquals("Buzz", fizzBuzz.processNumber(10));
        assertEquals("FizzBuzz", fizzBuzz.processNumber(15));
    }
}