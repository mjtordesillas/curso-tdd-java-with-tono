public class MyDrinkMakerClient implements DrinkMakerClient {

  private DrinkMaker drinkMaker;

  public MyDrinkMakerClient(DrinkMaker drinkMaker) {this.drinkMaker = drinkMaker;}

  @Override
  public void make(Drink drink) {
    drinkMaker.execute(translateDrink(drink) + ":" + translateSugarAmount(drink) + ":" + translateStick(drink));
  }

  @Override
  public void warnShortOnMoney(Integer amountShort) {
    drinkMaker.execute("M:You are " + amountShort + " cents short");
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
    return translateDrinkSymbol(drink) + translateExtraHot(drink);
  }

  private String translateExtraHot(Drink drink) {
    if(drink.isExtraHot()) return "h";
    else return "";
  }

  private String translateDrinkSymbol(Drink drink) {
    if (drink.type() == DrinkType.TEA) return "T";
    if (drink.type() == DrinkType.CHOCOLATE) return "H";
    else return "C";
  }
}
