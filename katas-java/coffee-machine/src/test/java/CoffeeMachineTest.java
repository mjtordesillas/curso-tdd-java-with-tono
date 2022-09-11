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
    coffeeMachine.insertMoney(40);
    coffeeMachine.tea();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.tea());
  }

  @Test
  public void just_coffee() {
    coffeeMachine.insertMoney(60);
    coffeeMachine.coffee();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.coffee());
  }

 @Test
  public void just_chocolate() {
   coffeeMachine.insertMoney(50);
    coffeeMachine.chocolate();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.chocolate());
  }

  @Test
  public void just_orange_juice() {
    coffeeMachine.insertMoney(60);
    coffeeMachine.orangeJuice();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.orangeJuice());
  }

  @Test
  public void drink_with_one_sugar() {
    coffeeMachine.insertMoney(60);
    coffeeMachine.coffee();
    coffeeMachine.addSugar();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.coffee(SugarAmount.ONE));
  }

  @Test
  public void drink_with_two_sugars() {
    coffeeMachine.insertMoney(50);
    coffeeMachine.chocolate();
    coffeeMachine.addSugar();
    coffeeMachine.addSugar();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.chocolate(SugarAmount.TWO));
  }

  @Test
  public void drink_with_two_sugars_even_when_asking_for_more() {
    coffeeMachine.insertMoney(40);
    coffeeMachine.tea();
    coffeeMachine.addSugar();
    coffeeMachine.addSugar();
    coffeeMachine.addSugar();
    coffeeMachine.make();

    verify(drinkMakerClient).make(Drink.tea(SugarAmount.TWO));
  }

  @Test
  public void message_drink_maker_when_short_on_money() {
    coffeeMachine.insertMoney(39);
    coffeeMachine.tea();
    coffeeMachine.make();

    Integer amountShort = 1;
    verify(drinkMakerClient).warnShortOnMoney(amountShort);
  }
}

