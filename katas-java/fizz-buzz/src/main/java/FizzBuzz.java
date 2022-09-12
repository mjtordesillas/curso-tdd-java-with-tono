import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public List<String> fizzBuzzle() {
    List<String> fizzBuzzed = new ArrayList<String>();
    for(Integer number = 1; number <= 100; number++) {
      if(isFizzBuzz(number)) fizzBuzzed.add("FizzBuzz");
      else if(isFizz(number)) fizzBuzzed.add("Fizz");
      else if(isBuzz(number)) fizzBuzzed.add("Buzz");
      else fizzBuzzed.add(number.toString());
    }

    return fizzBuzzed;
  }

  private boolean isFizzBuzz(int number) {
    return isFizz(number) && isBuzz(number);
  }

  private boolean isBuzz(Integer number) {
    return isMultipleOfFive(number) || containsFive(number);
  }

  private boolean isFizz(Integer number) {
    return isMultipleOfThree(number) || containsThree(number);
  }

  private boolean containsThree(Comparable<Integer> number) {
    return number.toString().contains("3");
  }

  private boolean isMultipleOfThree(int number) {
    return number % 3 == 0;
  }

  private boolean isMultipleOfFive(int number) {
    return number % 5 == 0;
  }

  private boolean containsFive(Comparable<Integer> number) {
    return number.toString().contains("5");
  }

}
