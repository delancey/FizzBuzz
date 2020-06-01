import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void test(){

    }

    @Test
    public void shouldProcessInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();        
        assertEquals("1", fizzBuzz.processNumber(1));
    }
}