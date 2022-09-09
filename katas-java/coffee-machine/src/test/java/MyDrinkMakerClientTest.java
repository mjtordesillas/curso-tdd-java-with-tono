import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MyDrinkMakerClientTest {

  @Test
  public void just_tea(){
    DrinkMaker drinkMaker = mock(DrinkMaker.class);
    DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

    drinkMakerClient.make(new Drink(DrinkType.TEA));

    verify(drinkMaker).execute("T::");
  }

}
