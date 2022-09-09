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
    coffeeMaker.addSugar();
    coffeeMaker.make();

    verify(drinkMaker).execute("T:1:0");
  }

  @Test
  public void hot_chocolate_without_sugar() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);

    coffeeMaker.chocolate();
    coffeeMaker.make();

    verify(drinkMaker).execute("H::");
  }

  @Test
  public void coffee_with_two_sugars() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);

    coffeeMaker.coffee();
    coffeeMaker.addSugar();
    coffeeMaker.addSugar();
    coffeeMaker.make();

    verify(drinkMaker).execute("C:2:0");
  }
}
