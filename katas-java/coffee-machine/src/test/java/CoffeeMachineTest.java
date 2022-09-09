import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeMachineTest {

    @Test
    public void just_tea() {
        DrinkMakerClient drinkMakerClient = mock(DrinkMakerClient.class);

        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMakerClient);
        coffeeMachine.tea();
        coffeeMachine.make();

        verify(drinkMakerClient).make(Drink.TEA);
    }

    @Test
    public void tea_with_sugar() {
        DrinkMakerClient drinkMakerClient = mock(DrinkMakerClient.class);

        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMakerClient);
        coffeeMachine.tea();
        coffeeMachine.addSugar();
        coffeeMachine.make();

        verify(drinkMakerClient).make(Drink.TEA, Sugar.ONE);
    }
}
