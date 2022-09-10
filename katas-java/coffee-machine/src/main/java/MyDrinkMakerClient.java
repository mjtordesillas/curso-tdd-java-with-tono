public class MyDrinkMakerClient implements DrinkMakerClient {

  private DrinkMaker drinkMaker;

  public MyDrinkMakerClient(DrinkMaker drinkMaker) {this.drinkMaker = drinkMaker;}

  @Override
  public void make(Drink drink) {
    drinkMaker.execute(translateDrink(drink) +"::");
  }

  private String translateDrink(Drink drink) {
    if (drink.type() == DrinkType.TEA) return "T";
    else return "C";
  }
}
