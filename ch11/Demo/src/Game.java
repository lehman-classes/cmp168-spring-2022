public class Game {

  private int score = 0;

  public Game() {
    System.out.println("default constructor");
  }

  private int calculateMagicNumber() {
    System.out.println("calculating magic number...");
    int magicNumber = 0;

    System.out.println("done calculating magic number");
    return magicNumber;
  }

  public void calculateScore() {
    // big calculation to get the user score
    System.out.println("calculating score...");

    int magicNumber = calculateMagicNumber();

    try {
      score = 10 / magicNumber;
    } catch (Exception e) {
      System.out.println("exception occurred");
      // score = 1;
    }
    // causes Exception

    System.out.println("done calculating");
  }

  public int getScore() {
    return score;
  }

}
