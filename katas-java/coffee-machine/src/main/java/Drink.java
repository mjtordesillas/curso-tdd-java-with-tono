import java.util.Objects;

public class Drink {

  private DrinkType drinkType;
  private SugarAmount sugarAmount;

  public Drink(DrinkType drinkType) {this.drinkType = drinkType;
  this.sugarAmount = SugarAmount.NONE;
  }

  public Drink(DrinkType drinkType, SugarAmount sugarAmount) {
    this.drinkType = drinkType;
    this.sugarAmount = sugarAmount;
  }

  public void addSugar() {
    if(this.sugarAmount == SugarAmount.NONE) this.sugarAmount = SugarAmount.ONE;
    else this.sugarAmount = SugarAmount.TWO;
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
    return drinkType == drink.drinkType && sugarAmount == drink.sugarAmount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(drinkType, sugarAmount);
  }

  @Override
  public String toString() {
    return "Drink{" +
           "drinkType=" + drinkType +
           ", sugarAmount=" + sugarAmount +
           '}';
  }

  public DrinkType type() {
    return this.drinkType;
  }

  public SugarAmount sugarAmount() {
    return this.sugarAmount;
  }
}
