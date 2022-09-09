public class MyDrinkMakerClient implements DrinkMakerClient {
    private final DrinkMaker drinkMaker;

    public MyDrinkMakerClient(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    @Override
    public void make(String tea, Sugar sugar) {
        drinkMaker.execute("T::");
    }
}
