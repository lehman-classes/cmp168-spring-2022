public class App {
  public static void main(String[] args) throws Exception {

    // ALL About LOOPS
    int iterations = 5;

    // FOR i
    // for (int i = 0; i < iterations; i++) {
    // System.out.println("Hello, World!");
    // }

    // FOR EACH
    // int[] nums = { 1, 2, 3 };
    // for (int num : nums) {
    // System.out.println(num);
    // }

    // WHILE
    // while (iterations > 0) {
    // System.out.println("iteration: " + iterations--);
    // }

    // DO WHILE
    // do {
    // System.out.println("do while'ng - iteration: " + iterations);
    // iterations--;
    // // checking some condition
    // if (iterations == 3) {
    // break;
    // }

    // } while (iterations > 0);

    for (int cookieNum = 5; cookieNum > 0; cookieNum--) {
      System.out.println("inside loop");
      if (cookieNum == 3) {
        System.out.println("look at cookie # " + cookieNum);
        continue;// do not eat cookie #3 skip to next value
      }
      System.out.println("eat cookie # " + cookieNum);
    }
    System.out.println("done eating cookies");

  }
}
