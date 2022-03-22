public class Food {
  private String name;
  private int calories;
  private int portionSizeInOunces;

  Food(String name, int calories, int portionSizeInOunces) {
    this.name = name;
    this.calories = calories;
    this.portionSizeInOunces = portionSizeInOunces;
  }

  public String getName() {
    return name;
  }

  public int getCalories() {
    return calories;
  }

  public int getPortionSizeInOunces() {
    return portionSizeInOunces;
  }

  @Override
  public String toString() {
    return "Food [calories=" + calories + ", name=" + name + ", portionSizeInOunces=" + portionSizeInOunces + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Food other = (Food) obj;
    if (calories != other.calories)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (portionSizeInOunces != other.portionSizeInOunces)
      return false;
    return true;
  }

}
