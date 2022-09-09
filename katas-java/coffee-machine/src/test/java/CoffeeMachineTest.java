import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeMachineTest {

  DrinkMakerClient drinkMakerClient;
  CoffeeMachine coffeeMachine;

  @BeforeEach
  void setUp() {
    drinkMakerClient = mock(DrinkMakerClient.class);
    coffeeMachine = new CoffeeMachine(drinkMakerClient);
  }

  @Test
  public void just_tea() {
    coffeeMachine.tea();
    coffeeMachine.make();

    verify(drinkMakerClient).make(new Drink(DrinkType.TEA));
  }

  @Test
  public void just_coffee() {
    coffeeMachine.coffee();
    coffeeMachine.make();

    verify(drinkMakerClient).make(new Drink(DrinkType.COFFEE));
  }

 @Test
  public void just_chocolate() {
    coffeeMachine.chocolate();
    coffeeMachine.make();

    verify(drinkMakerClient).make(new Drink(DrinkType.CHOCOLATE));
  }
  @Test
  public void drink_with_one_sugar() {
    coffeeMachine.coffee();
    coffeeMachine.addSugar();
    coffeeMachine.make();

    verify(drinkMakerClient).make(new Drink(DrinkType.COFFEE, SugarAmount.ONE));
  }
}

