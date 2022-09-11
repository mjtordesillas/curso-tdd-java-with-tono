import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MyDrinkMakerClientTest {

  @Test
  public void just_tea() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

    drinkMakerClient.make(Drink.tea());

    verify(drinkMaker).execute("T::");
  }

  @Test
  public void just_coffee() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

    drinkMakerClient.make(Drink.coffee());

    verify(drinkMaker).execute("C::");
  }

  @Test
  public void just_chocolate() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

    drinkMakerClient.make(Drink.chocolate());

    verify(drinkMaker).execute("H::");
  }

  @Test
  public void drink_with_one_sugar() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

    drinkMakerClient.make(Drink.chocolate(SugarAmount.ONE));

    verify(drinkMaker).execute("H:1:0");
  }

  @Test
  public void drink_with_two_sugars() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

    drinkMakerClient.make(Drink.coffee(SugarAmount.TWO));

    verify(drinkMaker).execute("C:2:0");
  }

  @Test
  public void when_short_on_money_send_message_with_missing_amount() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

    drinkMakerClient.warnShortOnMoney(20);

    verify(drinkMaker).execute("M:You are 20 cents short");
  }

  @Test
  public void extra_hot_drink() {
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

    drinkMakerClient.make(extraHotChocolate());

    verify(drinkMaker).execute("Hh::");
  }

  private Drink extraHotChocolate() {
    Drink extraHotChocolate = Drink.chocolate();
    extraHotChocolate.makeExtraHot();
    return extraHotChocolate;
  }

}
