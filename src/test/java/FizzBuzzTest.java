import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testInstanceCreation(){
        FizzBuzz fizzbuzz = new FizzBuzz();
       
        assertNotNull(fizzbuzz);
    }
    
    @Test
    public void testZeroAndNonNegativeLimit() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.play(0);
    assertEquals(Arrays.asList("Invalid input"), result);
    }

    @Test
    public void testNumbersNotDivisibleBy3Or5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.play(2);
        assertEquals(Arrays.asList("1", "2"), result);
    }

    @Test
    public void testNumbersDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.play(3);
        assertEquals(Arrays.asList("1", "2", "Fizz"), result);
    }

    @Test
    public void testNumbersDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.play(5);
        assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz"), result);
    }

    @Test
    public void testNumbersDivisibleByBoth3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.play(15);
        assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), result);
    }




}
