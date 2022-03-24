public class App /* extends is used for inheritance */ {
  public static void main(String[] args) throws /* throws is used to throw Exception */ Exception {

    Game game = new Game();

    try {
      game.generateSecretCode();
    } catch (GameException e) {
      System.out.println("this is a game exception");
      // game.setSecret("UNKWN");
    } catch (Exception e) {
      System.out.println("now it must be really bad");
    }

    System.out.println("secret: " + game.getSecret());

    // game.calculateScore();
    // int score = game.getScore();
    // if (score == -1) {
    // // something Exceptional must have happened
    // System.out.println("Something Exceptional happened");
    // }
    // System.out.println("score: " + game.getScore());
  }
}
