import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testInstanceCreation(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertNotNull(fizzbuzz);
    }


}
