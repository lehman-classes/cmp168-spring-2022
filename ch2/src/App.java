public class App {
  public static void main(String[] args) {

    // variables
    int number; // declaring a variable of type int
    number = 10; // assigning a value to this variable

    // print out value in number
    System.out.println("number is " + number);

    String name = "Hendrix"; // declaring a variable of type String
                             // and assigning a value to this variable
    // print out value in name
    System.out.println("name is " + name);

    // after declaring a variable we can replace its value
    number = 12;

    // print out new value in number
    System.out.println("new number is " + number);

    // adding a literal value and the value in variable number to create a new
    // variable total
    int total = number + 5;
  }
}
