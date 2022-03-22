public class Cat extends Pet implements FoodEater {
  public void play() {
    System.out.println("Cat play");
  }

  @Override
  public void eat() {
    System.out.println("cat is eating");
  }

  @Override
  public void eat(Food f) {
    System.out.println("cat is eating: " + f.getName());
  }

  @Override
  public double metabolizeFood(Food f) {
    System.out.println("metabolizing...");
    return f.getCalories() / METABOLISM_RATING_FAST;
  }

}
