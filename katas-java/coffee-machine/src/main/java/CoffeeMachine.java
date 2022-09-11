public class CoffeeMachine {

  private DrinkMakerClient drinkMakerClient;
  private Drink drink;
  private Integer moneyAmountInMachine;

  public CoffeeMachine(DrinkMakerClient drinkMakerClient) {
    this.drinkMakerClient = drinkMakerClient;
    this.moneyAmountInMachine = 0;
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
    if(moneyAmountInMachine >= drink.price()) {
      drinkMakerClient.make(drink);
    } else {
      drinkMakerClient.warnShortOnMoney(drink.price() - moneyAmountInMachine);
    }
  }

  public void insertMoney(Integer amountInserted) {
    moneyAmountInMachine = moneyAmountInMachine + amountInserted;
  }
}
