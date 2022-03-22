public class Dog {

  public static class Bones {

  }

  private String name;
  private double weight;
  private double height;
  private boolean isVaccinated;
  private int ageInDogYears;

  // public Dog() {
  // // System.out.println("class0: ");
  // }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public boolean isVaccinated() {
    return isVaccinated;
  }

  public void setVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public int getAgeInDogYears() {
    return ageInDogYears;
  }

  public void setAgeInDogYears(int ageInDogYears) {
    this.ageInDogYears = ageInDogYears;
  }

  public void doSomething() {
    System.out.println("doing something");
  }

  @Override
  public String toString() {
    return "Dog [ageInDogYears=" + ageInDogYears + ", height=" + height +
        ",isVaccinated=" + isVaccinated + ", name="
        + name + ", weight=" + weight + "]";
  }

}