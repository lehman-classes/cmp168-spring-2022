// class keyword is used to describe an object
// an object is an instance (meaning is in memory) of a class
public class Person {
  // attributes
  private String name;
  private int stepTaken = 0;

  // constructor
  public Person(String name) {
    this.name = name;
  }

  // the things you could do with the object
  // are described as methods
  public void addStep() {
    stepTaken++;
  }
}
