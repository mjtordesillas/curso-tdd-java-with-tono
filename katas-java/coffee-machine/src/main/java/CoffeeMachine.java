public class CoffeeMachine {

    private DrinkMaker drinkMaker;
    private DrinkMakerClient drinkMakerClient;

    public CoffeeMachine(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    public CoffeeMachine(DrinkMakerClient drinkMakerClient) {
        this.drinkMakerClient = drinkMakerClient;
    }

    public void tea() {
    }

    public void addSugar() {
    }

    public void make() {
      drinkMakerClient.make(Drink.TEA);
    }

    public void chocolate() {
    }

    public void coffee() {
    }
}
