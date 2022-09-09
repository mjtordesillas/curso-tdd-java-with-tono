import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DrinkMakerClientTest {
    @Test
    public void tea_without_sugar() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

        drinkMakerClient.make(Drink.TEA, Sugar.NONE);

        verify(drinkMaker).execute("T::");
    }
    @Test
    public void tea_with_one_sugar() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

        drinkMakerClient.make(Drink.TEA, Sugar.ONE);

        verify(drinkMaker).execute("T:1:0");
    }
    @Test
    public void tea_with_two_sugars() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        DrinkMakerClient drinkMakerClient = new MyDrinkMakerClient(drinkMaker);

        drinkMakerClient.make(Drink.TEA, Sugar.TWO);

        verify(drinkMaker).execute("T:2:0");
    }

}
