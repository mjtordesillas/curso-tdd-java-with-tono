public class CoffeeMachine {

    private DrinkMaker drinkMaker;
    private DrinkMakerClient drinkMakerClient;
    private Sugar sugar = Sugar.NONE;
    private String drink = Drink.TEA;

    public CoffeeMachine(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    public CoffeeMachine(DrinkMakerClient drinkMakerClient) {
        this.drinkMakerClient = drinkMakerClient;
    }

    public void tea() {
    }

    public void addSugar() {
        if (sugar == Sugar.NONE) {
            sugar = Sugar.ONE;
        } else {
            sugar = Sugar.TWO;
        }
    }

    public void make() {
        drinkMakerClient.make(drink, sugar);
    }

    public void chocolate() {
        drink = Drink.CHOCOLATE;
    }

    public void coffee() {
    }
}
