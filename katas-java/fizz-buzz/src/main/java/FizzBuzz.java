import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public List<String> fizzBuzzle() {
    List<String> fizzBuzzed = new ArrayList<String>();
    for(Integer number = 1; number <= 100; number++) {
      if(number == 15) fizzBuzzed.add("FizzBuzz");
      else if(isFizz(number)) fizzBuzzed.add("Fizz");
      else if(isBuzz(number)) fizzBuzzed.add("Buzz");
      else fizzBuzzed.add(number.toString());
    }

    return fizzBuzzed;
  }

  private boolean isBuzz(Integer number) {
    return number % 5 == 0;
  }

  private boolean isFizz(Integer number) {
    return number % 3 == 0;
  }
}
