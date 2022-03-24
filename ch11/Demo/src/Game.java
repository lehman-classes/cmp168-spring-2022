public class Game {

  private int score = 0;
  private String secret;

  public Game() {
    System.out.println("default constructor");
  }

  public void generateSecretCode() throws GameException {
    // open file and get key
    // use that key to generate a random code
    String key = "";

    try {

      secret = /* key.charAt(0) + */ "SECRET";

      // if something bad happens here
      throw new GameException("Something went terribly wrong");

    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("An StringIndexOutOfBoundsException occurred");
      key = "A";
    } catch (ArithmeticException e) {
      System.out.println("An ArithmeticException occurred");
      // fix code here
    } catch (Exception ex) {
      System.out.println("An Exception occurred");
      // re-throwing the Exception
      throw ex; // new Exception("Some aaaUnknown stuff happened");
    } finally {
      // when dealing with file or any other system resource
      // java ask the operating system and it creates a "handle"
      // close()
      if (secret == null) {
        secret = "UNKWN";
      }
    }

  }

  public String getSecret() {
    return secret;
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
      score = -1;
    }
    // causes Exception

    System.out.println("done calculating");
  }

  public int getScore() {
    return score;
  }

  // public void setSecret(String secret) {
  // this.secret = secret;
  // }

}
