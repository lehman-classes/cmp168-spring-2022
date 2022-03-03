public class App {
  public static void main(String[] args) throws Exception {

    // creating an instance of Car
    Car car1 = new Car("Blue"); // object car1
    System.out.println(car1.getColor());
    car1.setColor("Black");
    System.out.println(car1.getColor());

    // creating another instance of Car
    Car car2 = new Car(); // call default constructor
    String carColor = car2.getColor();
    System.out.println("carColor: " + carColor);

    car2.calculateMPG();

    // creating yet another instance of Car
    Car car3 = new Car("Purple"); // object car3
    car3.accelerate();
    car3.accelerate();

  }
}
