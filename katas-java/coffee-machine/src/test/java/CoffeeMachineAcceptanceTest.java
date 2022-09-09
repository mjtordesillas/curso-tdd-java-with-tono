import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class CoffeeMachineAcceptanceTest {

  @Test
  public void tea_with_sugar() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);

    coffeeMaker.tea();
    coffeeMaker.sugar();
    coffeeMaker.make();

    verify(drinkMaker).execute("T:1:0");
  }
}
