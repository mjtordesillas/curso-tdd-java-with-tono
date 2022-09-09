public class CoffeeMachine {

    private DrinkMaker drinkMaker;
    private DrinkMakerClient drinkMakerClient;
    private Sugar sugar = Sugar.NONE;

    public CoffeeMachine(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    public CoffeeMachine(DrinkMakerClient drinkMakerClient) {
        this.drinkMakerClient = drinkMakerClient;
    }

    public void tea() {
    }

    public void addSugar() {
        sugar = Sugar.ONE;
    }

    public void make() {
        if (sugar == Sugar.NONE) {
            drinkMakerClient.make(Drink.TEA);
            return;
        }

        drinkMakerClient.make(Drink.TEA, Sugar.ONE);
    }

    public void chocolate() {
    }

    public void coffee() {
    }
}
