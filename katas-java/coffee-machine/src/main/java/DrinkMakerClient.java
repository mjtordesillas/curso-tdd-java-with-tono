public interface DrinkMakerClient {

  public void make(Drink drink);

  void warnShortOnMoney(Integer amountShort);
}
