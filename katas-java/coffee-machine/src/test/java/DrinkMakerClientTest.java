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
}
