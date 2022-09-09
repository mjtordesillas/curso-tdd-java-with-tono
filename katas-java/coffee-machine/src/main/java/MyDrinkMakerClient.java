public class MyDrinkMakerClient implements DrinkMakerClient {

  private DrinkMaker drinkMaker;

  public MyDrinkMakerClient(DrinkMaker drinkMaker) {this.drinkMaker = drinkMaker;}

  @Override
  public void make(Drink drink) {
    drinkMaker.execute("T::");
  }
}
