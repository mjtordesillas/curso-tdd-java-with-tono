import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeMachineAcceptanceTest {

    @Test
    public void tea_with_sugar() {

        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMaker);
        coffeeMachine.insertMoney(100.0);

        coffeeMachine = givenACoffeeMachineWithEnoughMoney();

        coffeeMachine.tea();
        coffeeMachine.addSugar();
        coffeeMachine.make();

        verify(drinkMaker).execute("T:1:0");
    }

    @Test
    public void hot_chocolate_without_sugar() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMaker);

        coffeeMachine.chocolate();
        coffeeMachine.make();

        verify(drinkMaker).execute("H::");
    }

    @Test
    public void coffee_with_two_sugars() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMaker);

        coffeeMachine.coffee();
        coffeeMachine.addSugar();
        coffeeMachine.addSugar();
        coffeeMachine.make();

        verify(drinkMaker).execute("C:2:0");
    }

    @Test
    public void not_enough_money_for_a_tea() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMachine coffeeMachine = new CoffeeMachine(drinkMaker);

        coffeeMachine.tea();
        coffeeMachine.insert();
        coffeeMachine.make();

        verify(drinkMaker).execute("M:");
    }
}
