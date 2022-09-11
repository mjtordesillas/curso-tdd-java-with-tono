import java.util.Objects;

public class Drink {

  private DrinkType drinkType;
  private SugarAmount sugarAmount;
  private boolean extraHot = false;

  private Drink(DrinkType drinkType) {
    this.drinkType = drinkType;
    this.sugarAmount = SugarAmount.NONE;
  }

  private Drink(DrinkType drinkType, SugarAmount sugarAmount) {
    this.drinkType = drinkType;
    this.sugarAmount = sugarAmount;
  }

  public static Drink tea() {
    return new Drink(DrinkType.TEA);
  }

  public static Drink coffee() {
    return new Drink(DrinkType.COFFEE);
  }

  public static Drink chocolate() {
    return new Drink(DrinkType.CHOCOLATE);
  }

  public static Drink coffee(SugarAmount sugarAmount) {
    return new Drink(DrinkType.COFFEE, sugarAmount);
  }

  public static Drink chocolate(SugarAmount sugarAmount) {
    return new Drink(DrinkType.CHOCOLATE, sugarAmount);
  }

  public static Drink tea(SugarAmount sugarAmount) {
    return new Drink(DrinkType.TEA, sugarAmount);
  }

  public static Drink orangeJuice() {
    return new Drink(DrinkType.ORANGE_JUICE);
  }

  public void addSugar() {
    if (this.sugarAmount == SugarAmount.NONE) {
      this.sugarAmount = SugarAmount.ONE;
    } else {
      this.sugarAmount = SugarAmount.TWO;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drink drink = (Drink) o;
    return extraHot == drink.extraHot && drinkType == drink.drinkType && sugarAmount == drink.sugarAmount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(drinkType, sugarAmount, extraHot);
  }

  @Override
  public String toString() {
    return "Drink{" +
           "drinkType=" + drinkType +
           ", sugarAmount=" + sugarAmount +
           ", extraHot=" + extraHot +
           '}';
  }

  public DrinkType type() {
    return this.drinkType;
  }

  public SugarAmount sugarAmount() {
    return this.sugarAmount;
  }

  public Integer price() {
    if(this.drinkType == DrinkType.TEA) return 40;
    if(this.drinkType == DrinkType.CHOCOLATE) return 50;
    return 60;
  }

  public void makeExtraHot() {
    this.extraHot = true;
  }
}
