public class CoffeeMachine {

  private DrinkMakerClient drinkMakerClient;

  public CoffeeMachine(DrinkMakerClient drinkMakerClient) {

    this.drinkMakerClient = drinkMakerClient;
  }

  public void tea() {
  }

  public void make() {
    drinkMakerClient.make(new Drink(DrinkType.TEA));
  }
}
