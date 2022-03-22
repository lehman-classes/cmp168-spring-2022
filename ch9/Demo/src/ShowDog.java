public class ShowDog extends Dog {

  private int numTrophies;
  private String bestFeature = "unknown";

  public ShowDog() {
    //super();
    // super.setName("Show Dog Doe");
    setName("Show Dog Doe");
    // System.out.println("class1: ");
  }

  public ShowDog(String name) {
    setName(name);
  }

  public ShowDog(int numTrophies, String bestFeature) {
    this.numTrophies = numTrophies;
    this.bestFeature = bestFeature;
  }

  public ShowDog(String name, double wt, double ht, boolean isVac, int age, int numTrophies, String bestFeature) {
    setName(name);
    setWeight(wt);
    setHeight(ht);
    setVaccinated(isVac);
    setAgeInDogYears(age);
    this.numTrophies = numTrophies;
    this.bestFeature = bestFeature;
  }

  public int getNumTrophies() {
    return numTrophies;
  }

  public void setNumTrophies(int numTrophies) {
    this.numTrophies = numTrophies;
  }

  public String getBestFeature() {
    return bestFeature;
  }

  public void setBestFeature(String bestFeature) {
    this.bestFeature = bestFeature;
  }

  public void addTrophy() {
    numTrophies++;
  }

  protected boolean isValid() {
    return numTrophies >= 0;
  }

  @Override
  public String toString() {
    return super.toString() + "\nShowDog [numTrophies=" + numTrophies + ", bestFeature=" +
        bestFeature + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null) {
      if (obj instanceof ShowDog) {
        ShowDog that = (ShowDog) obj;
        return that.getName().equals(getName()) && that.getWeight() == getWeight()
            && that.getHeight() == getHeight() && that.isVaccinated() == isVaccinated()
            && that.getAgeInDogYears() == getAgeInDogYears() && that.getNumTrophies() == this.numTrophies
            && that.getBestFeature().equals(this.bestFeature);
      }
    }
    return false;
  }

  @Override
  public void doSomething() {
    System.out.println("something better");
  }
}
