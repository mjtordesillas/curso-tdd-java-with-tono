import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FizzBuzzTest {

	@Test
	public void regular_numbers_as_themselves() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(0), is("1"));
		assertThat(fizzbuzzed.get(97), is("98"));
	}

	@Test
	public void three_is_fizz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(2), is("Fizz"));
	}

	@Test
	public void nine_is_fizz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(8), is("Fizz"));
	}

	@Test
	public void five_is_buzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(4), is("Buzz"));
	}

	@Test
	public void ten_is_buzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(9), is("Buzz"));
	}
}
