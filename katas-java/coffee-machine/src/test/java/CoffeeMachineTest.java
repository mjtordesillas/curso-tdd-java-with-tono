import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CoffeeMachineTest {



    @Test
    public void just_tea_xx() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);
        DrinkMakerProtocol drinkMakerProtocol = mock(DrinkMakerProtocol.class);
        when(drinkMakerProtocol.translate() ).thenReturn("T::");


        coffeeMaker.tea();
        coffeeMaker.make();

        drinkMakerProtocol.tea();
        coffeeMaker.make();

        verify(drinkMakerProtocol).translate(Drink.TEA, Sugar.count);
        verify(drinkMaker).execute(any());
    }

    @Test
    public void just_tea() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);

        coffeeMaker.tea();
        coffeeMaker.make();

        verify(drinkMaker).execute("T::");
    }

    @Test
    public void tea_with_one_sugar() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);

        coffeeMaker.tea();
        coffeeMaker.addSugar();
        coffeeMaker.make();

        verify(drinkMaker).execute("T:1:0");
    }

    @Test
    public void tea_with_two_sugars() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);

        coffeeMaker.tea();
        coffeeMaker.addSugar();
        coffeeMaker.addSugar();
        coffeeMaker.make();

        verify(drinkMaker).execute("T:2:0");
    }

    @Test
    public void tea_with_two_sugars_when_asking_for_more() {
        DrinkMaker drinkMaker = mock(DrinkMaker.class);
        CoffeeMaker coffeeMaker = new CoffeeMaker(drinkMaker);

        coffeeMaker.tea();
        coffeeMaker.addSugar();
        coffeeMaker.addSugar();
        coffeeMaker.addSugar();
        coffeeMaker.make();

        verify(drinkMaker).execute("T:2:0");
    }
}
