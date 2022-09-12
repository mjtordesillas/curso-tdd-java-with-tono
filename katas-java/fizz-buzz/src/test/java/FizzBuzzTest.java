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
	public void multiples_of_three_are_fizz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(2), is("Fizz"));
		assertThat(fizzbuzzed.get(98), is("Fizz"));
	}

	@Test
	public void multiples_of_five_are_buzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(4), is("Buzz"));
		assertThat(fizzbuzzed.get(99), is("Buzz"));
	}

	@Test
	public void multiples_of_three_and_five_are_fizzbuzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(14), is("FizzBuzz"));
		assertThat(fizzbuzzed.get(89), is("FizzBuzz"));
	}

	@Test
	public void fizzbuzz_returns_a_hundred_numbers() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.size(), is(100));
	}
	@Test
	public void numbers_containing_three_are_fizz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(12), is("Fizz"));
		assertThat(fizzbuzzed.get(30), is("Fizz"));
		assertThat(fizzbuzzed.get(82), is("Fizz"));
	}

	@Test
	public void numbers_containing_five_are_buzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(51), is("Buzz"));
		assertThat(fizzbuzzed.get(58), is("Buzz"));
	}

	@Test
	public void numbers_containing_five_and_three_are_fizzbuzz(){
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(52), is("FizzBuzz"));
	}
}
