public class CoffeeMachine {

  private DrinkMakerClient drinkMakerClient;
  private Drink drink;

  public CoffeeMachine(DrinkMakerClient drinkMakerClient) {

    this.drinkMakerClient = drinkMakerClient;
  }

  public void tea() {
    drink = Drink.tea();
  }

  public void coffee() {
    drink = Drink.coffee();
  }

  public void chocolate() {
    drink = Drink.chocolate();
  }

  public void addSugar() {
    drink.addSugar();
  }

  public void make() {
    drinkMakerClient.make(drink);
  }
}
