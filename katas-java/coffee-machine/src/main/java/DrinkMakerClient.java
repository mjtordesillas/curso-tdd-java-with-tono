public interface DrinkMakerClient {
    void make(String drinkType);

    void make(String tea, Sugar sugar);
}
