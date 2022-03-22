public interface FoodEater {

  static final double METABOLISM_RATING_FAST = 0.75;
  static final double METABOLISM_RATING_MEDIUM = 0.50;
  static final double METABOLISM_RATING_SLOW = 0.15;

  void eat();

  void eat(Food f);

  double metabolizeFood(Food f);
}
