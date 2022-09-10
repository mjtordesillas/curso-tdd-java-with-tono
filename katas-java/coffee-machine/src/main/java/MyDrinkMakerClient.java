public class MyDrinkMakerClient implements DrinkMakerClient {

  private DrinkMaker drinkMaker;

  public MyDrinkMakerClient(DrinkMaker drinkMaker) {this.drinkMaker = drinkMaker;}

  @Override
  public void make(Drink drink) {
    drinkMaker.execute(translateDrink(drink) + ":" + translateSugarAmount(drink) + ":" + translateStick(drink));
  }

  private String translateStick(Drink drink) {
    if(drink.sugarAmount() == SugarAmount.NONE) return "";
    return "0";
  }

  private String translateSugarAmount(Drink drink) {
    if (drink.sugarAmount() == SugarAmount.NONE) return "";
    if (drink.sugarAmount() == SugarAmount.ONE) return "1";
    return "2";
  }

  private String translateDrink(Drink drink) {
    if (drink.type() == DrinkType.TEA) return "T";
    if (drink.type() == DrinkType.CHOCOLATE) return "H";
    else return "C";
  }
}
