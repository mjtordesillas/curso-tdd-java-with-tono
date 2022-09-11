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

    verify(drinkMakerClient).make(Drink.tea());
  }

  @Test
  public void just_coffee() {
    coffeeMachine.coffee();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.coffee());
  }

 @Test
  public void just_chocolate() {
    coffeeMachine.chocolate();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.chocolate());
  }
  @Test
  public void drink_with_one_sugar() {
    coffeeMachine.coffee();
    coffeeMachine.addSugar();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.coffee(SugarAmount.ONE));
  }

  @Test
  public void drink_with_two_sugars() {
    coffeeMachine.chocolate();
    coffeeMachine.addSugar();
    coffeeMachine.addSugar();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.chocolate(SugarAmount.TWO));
  }

  @Test
  public void drink_with_two_sugars_even_when_asking_for_more() {
    coffeeMachine.tea();
    coffeeMachine.addSugar();
    coffeeMachine.addSugar();
    coffeeMachine.addSugar();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.tea(SugarAmount.TWO));
  }
}

