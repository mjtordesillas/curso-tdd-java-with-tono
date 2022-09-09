import java.util.Objects;

public class Drink {

  private DrinkType drinkType;

  public Drink(DrinkType drinkType) {this.drinkType = drinkType;}

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drink drink = (Drink) o;
    return drinkType == drink.drinkType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(drinkType);
  }

  @Override
  public String toString() {
    return "Drink{" +
           "drinkType=" + drinkType +
           '}';
  }
}
