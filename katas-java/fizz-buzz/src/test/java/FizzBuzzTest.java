import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FizzBuzzTest {

	@Test
	public void one_is_one() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		List<String> fizzbuzzed = fizzBuzz.fizzBuzzle();

		assertThat(fizzbuzzed.get(0), is("1"));
	}
}
