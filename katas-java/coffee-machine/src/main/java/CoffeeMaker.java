public class CoffeeMaker {

  private DrinkMaker drinkMaker;

  public CoffeeMaker(DrinkMaker drinkMaker) {
    this.drinkMaker = drinkMaker;
  }

  public void tea() {

  }

  public void addSugar() {
  }

  public void make() {
    drinkMaker.execute("T::");
  }

  public void chocolate() {
  }

  public void coffee() {
  }
}
