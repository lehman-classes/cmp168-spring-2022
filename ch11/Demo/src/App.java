public class App /* extends is used for inheritance */ {
  public static void main(String[] args) throws /* throws is used to throw Exception */ Exception {

    Game game = new Game();
    game.calculateScore();
    System.out.println("score: " + game.getScore());
  }
}
