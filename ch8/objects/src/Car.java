public class Car {

  // DRY - Don't Repeat Yourself

  // member variables aka attributes
  private String color;

  // default constructor
  public Car() {
    this("white");
  }

  // another constructor with a single input parameter
  public Car(String color) {
    this.color = color;
    aboutMe();
  }

  // accessors -- getter
  public String getColor() {
    return color;
  }

  // mutators -- setter
  public void setColor(String color) {
    this.color = color;
  }

  // behavior
  public void accelerate() {
    System.out.println("going fast");
  }

  // operations
  public double calculateMPG() {
    // hard calculation
    return 50.4;
  }

  // method returns void (nothing) and it has no input parameter
  public void aboutMe() {
    System.out.print("Object of Type Car created: ");
    System.out.println("color: " + color);
  }
}
