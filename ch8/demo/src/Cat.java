public class Cat {
  
  private int numWhiskers;
  private double whiskerLength;
  private int age;
  private boolean isVaccinated;
  private String name;

  public Cat() {
  }

  public int getNumWhiskers() {
    return numWhiskers;
  }

  public void setNumWhiskers(int numWhiskers) {
    this.numWhiskers = numWhiskers;
  }

  public double getWhiskerLength() {
    return whiskerLength;
  }

  public void setWhiskerLength(double whiskerLength) {
    this.whiskerLength = whiskerLength;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Cat [age=" + age + ", isVaccinated=" + isVaccinated + ", name=" + name + ", numWhiskers=" + numWhiskers
        + ", whiskerLength=" + whiskerLength + "]";
  }

}
