public class CoffeeMachine {

    private DrinkMaker drinkMaker;
    private DrinkMakerProtocol drinkMakerProtocol;

    public CoffeeMachine(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    public CoffeeMachine(DrinkMaker drinkMaker, DrinkMakerProtocol drinkMakerProtocol) {
        this.drinkMaker = drinkMaker;
        this.drinkMakerProtocol = drinkMakerProtocol;
    }

    public void tea() {
    }

    public void addSugar() {
    }

    public void make() {
      drinkMaker.execute(drinkMakerProtocol.translate(Drink.TEA));
    }

    public void chocolate() {
    }

    public void coffee() {
    }
}
