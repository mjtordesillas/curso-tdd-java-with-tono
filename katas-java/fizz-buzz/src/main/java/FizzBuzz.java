import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public List<String> fizzBuzzle() {
    List<String> fizzBuzzed = new ArrayList<String>();
    for(Integer number = 1; number <= 4; number++) {
      if(number == 3) fizzBuzzed.add("Fizz");
      else fizzBuzzed.add(number.toString());
    }

    return fizzBuzzed;
  }
}
