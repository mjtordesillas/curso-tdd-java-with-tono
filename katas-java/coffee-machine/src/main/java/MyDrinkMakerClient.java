public class MyDrinkMakerClient implements DrinkMakerClient {
    private final DrinkMaker drinkMaker;

    public MyDrinkMakerClient(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    @Override
    public void make(String tea, Sugar sugar) {
        String sugarAmount = translateSugar(sugar);
        String stick = "";

        if (sugar != Sugar.NONE) {
            stick = "0";
        }
        drinkMaker.execute("T:" + sugarAmount + ":" + stick);
    }

    private String translateSugar(Sugar sugar) {
        String sugarAmount = "";
        if (sugar == Sugar.ONE) {
            sugarAmount = "1";
        } else if (sugar == Sugar.TWO) {
            sugarAmount = "2";
        }
        return sugarAmount;
    }
}
