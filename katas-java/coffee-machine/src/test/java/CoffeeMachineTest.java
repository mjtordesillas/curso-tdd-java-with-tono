import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class CoffeeMachineTest {

  @Test
  public void tea_without_sugar() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);

    coffeeMaker.tea();
    coffeeMaker.make();

    verify(drinkMaker).execute("T::");
  }
}
