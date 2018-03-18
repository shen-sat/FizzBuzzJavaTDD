import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void returnsFizzForThree() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.answer(3));
    }

    @Test
    public void returnsBuzzForFive() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.answer(5));
    }

    @Test
    public void returnsFizzBuzzForFifteen() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.answer(15));
    }

}