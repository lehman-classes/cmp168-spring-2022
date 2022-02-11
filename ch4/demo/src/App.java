public class App {
  public static void main(String[] args) throws Exception {

    // char[] hi1 = { 'h', 'i' };
    String hi2 = "hi";
    String hi1 = "Hi";

    char shirtSize = 'M';
    switch (shirtSize) {
      case 'M':// eliminate break to also print the next case’s instructions
      case 'm':
        System.out.println("Size Medium");
        // break;
      case 'L':// eliminate break to also print the next case’s instructions
      case 'l':
        System.out.println("Size Large");
        break;
      case 'X':// eliminate break to also print the next case’s instructions
      case 'x':
        System.out.print("Size XLarge");
        break;
      default:
        System.out.println("One Size Fits All");
        break;
    }

    if (hi1.equals(hi2)) {
      // this code should run if true
      System.out.println("It is true");
    } else if (false) {
      System.out.println("1");
    } else if (true) {
      System.out.println("2");
    } else if (true) {
      System.out.println("3");
    } else if (true) {
      System.out.println("4");
    } else if (true) {
      System.out.println("5");
    } else if (true) {
      System.out.println("6");
    } else if (true) {
      System.out.println("7");
    }

  }
}
