import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testInstanceCreation(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertNotNull(fizzbuzz);
    }
    @Test
    public void testInvalidInput() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    String result = fizzBuzz.play(0);
    assertEquals("Invalid input", result);
}


}
