public class App {
  private int luckyNumber = 7;

  public static void main(String[] args) throws Exception {

    Person person = new Person();

    System.out.println("Hello, World!");

    int i = 24;
    App app = new App();
    App sameApp = app;
    int[] nums = { 1, 2, 3 };
    App[] objs = { app, sameApp };

    int[] values = { 23, 12, 10, 11 }; // explicit
    int[] x = new int[5]; // <- explicit array length
    int[] y;

    values = app.addMoreValues(values);

  }

  public int[] addMoreValues(int[] oldValues) {
    int[] newValues = new int[oldValues.length + 4];
    for (int i = 0; i < newValues.length; i++) {
      int val = -1;
      if (i < 4) {
        val = oldValues[i];
      }
      newValues[i] = val;
    }
    return newValues;

  }

  // [MEMORY]
  // memory space in the computer hardware
  // static stuff goes here [
  // 0000 24
  // 0001 0000 <- is a reference to where the App object data exist
  // 0002 0000 <- same as above
  // 0003a 1
  // 0003b 2
  // 0003c 3
  // 0004a 0000
  // 0004b 0000
  // 0005a 0
  // 0005b 0
  // ...
  // newValues
  //
  // ]
  //
  // dynamic stuff goes here [
  // 0000 7
  // ]

}
