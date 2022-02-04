public class DemoVariable {
  public static void main(String[] args) {

    // declaring variables and assigning values
    // data types
    // int, long, short, byte, double, float, char, boolean <- primitive type values
    // are stored in memory
    // String <- reference type reference values are store in memory but actual
    // values are in the heap

    // binary values
    // 0 or 1
    // 0 <- a single bit
    // 0010 <- 4 bits
    // 0000 0000 <- byte

    // 0111 1111 1111 1111 1111 1111 1111 1111
    // 0000 0000 0000 0000 0000 0000 0000 0001
    // 1000 0000 0000 0000 0000 0000 0000 0000

    // 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
    // 0000

    // int dayOfTheWeek = 1;
    // final int NUMBER_OF_MONTHS = 12;

    // double d = 20.0 / 3; // implicit casting
    // System.out.printf("result: %.5f\n", d);

    // int a = 10;
    // int b = 3;
    // double x = (double) a / b; // explicit casting
    // System.out.printf("result: %.5f\n", x);

    // String color = "Blue";
    // byte[] chars = color.getBytes(); // { 'b', 'l', 'u', 'e' }; //
    // color.toCharArray();
    // System.out.println(color.charAt(1));
    // System.out.println(chars[0]);

    // int min = Math.min(100, 87);
    // System.out.println("min: " + min);

    // overflow
    int max = Integer.MAX_VALUE;
    int maxPlus = max + 1;
    long newMax = (long) max + 1;
    System.out.println("max: " + max);
    System.out.println("max: " + maxPlus);
    System.out.println("max: " + newMax);
  }

  public void calculateDayOfWeek() {

  }
}