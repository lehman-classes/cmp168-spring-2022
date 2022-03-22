public class Dog extends Pet {

  public void play() {
    System.out.println("Dog play");
  }

  @Override
  public void eat() {
    // some exceptional event happened here

    System.out.println("dog is eating");
  }

  @Override
  public void eat(Food f) {
    System.out.println("dog is eating: " + f.getName());
  }

  @Override
  public double metabolizeFood(Food f) {
    System.out.println("metabolizing...");
    return f.getCalories() / METABOLISM_RATING_MEDIUM;
  }

}
