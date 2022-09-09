public class MyDrinkMakerClient implements DrinkMakerClient {
    private final DrinkMaker drinkMaker;

    public MyDrinkMakerClient(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    @Override
    public void make(String tea, Sugar sugar) {
        if (sugar == Sugar.ONE) {
            drinkMaker.execute("T:1:0");
            return;
        }

        drinkMaker.execute("T::");
    }
}
