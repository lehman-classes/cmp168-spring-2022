public class BetterShowDog extends ShowDog {

  BetterShowDog() {
    System.out.println("class2: " + this.toString());
  }

  @Override
  public String toString() {
    return "\nHey human, I am a Better Show Dog";
  }
}
