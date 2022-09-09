public class CoffeeMachine {

  private DrinkMakerClient drinkMakerClient;
  private Drink drink;

  public CoffeeMachine(DrinkMakerClient drinkMakerClient) {

    this.drinkMakerClient = drinkMakerClient;
  }

  public void tea() {
    drink = new Drink(DrinkType.TEA);
  }

  public void coffee() {
    drink = new Drink(DrinkType.COFFEE);
  }

  public void chocolate() {
    drink = new Drink(DrinkType.CHOCOLATE);
  }

  public void make() {
    drinkMakerClient.make(drink);
  }
}
