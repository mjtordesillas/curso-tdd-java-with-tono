import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class CoffeeMachineTest {

  @Test
  public void just_tea() {
    DrinkMakerClient drinkMakerClient = mock(DrinkMakerClient.class);
    CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMakerClient);

    coffeeMachine.tea();
    coffeeMachine.make();

    verify(drinkMakerClient).make(new Drink(DrinkType.TEA));
  }

  @Test
  public void just_coffee() {
    DrinkMakerClient drinkMakerClient = mock(DrinkMakerClient.class);
    CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMakerClient);

    coffeeMachine.coffee();
    coffeeMachine.make();

    verify(drinkMakerClient).make(new Drink(DrinkType.COFFEE));
  }
}
