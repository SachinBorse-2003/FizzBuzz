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
    public void testInvalidInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> result = fizzBuzz.play(0);
    assertEquals(Arrays.asList("Invalid input"), result);
}


}
