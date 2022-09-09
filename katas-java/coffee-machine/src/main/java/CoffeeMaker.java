public class CoffeeMaker {

    private int sugars;
    private DrinkMaker drinkMaker;

    public CoffeeMaker(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
        this.sugars = 0;
    }

    public void tea() {

    }

    public void addSugar() {
        if (sugars < 2) {
            sugars++;
        }
    }

    public void make() {
        if (sugars > 0) {
            drinkMaker.execute("T:" + sugars + ":0");
        } else {
            drinkMaker.execute("T::");
        }
    }

    public void chocolate() {
    }

    public void coffee() {

    }
}
