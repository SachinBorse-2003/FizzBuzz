import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    public List<String> play(int range) {
        List<String> results = new ArrayList<>();
        
        if (range <= 0) {
            results.add("Invalid input");
            return results; 
        }
        for (int i = 1; i <= range; i++) {
            if (i % 15 == 0) {
                results.add("FizzBuzz");
            } else if (i % 3 == 0) {
                results.add("Fizz");
            } else if (i % 5 == 0) {
                results.add("Buzz");
            } else {
                results.add(String.valueOf(i));
            }
        }
        
        return results;
    }

}
