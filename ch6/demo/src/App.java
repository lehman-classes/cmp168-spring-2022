// our CLASS
// Note that the class name is the same as the file name except of the .java extension
public class App {
  // our program entry-point
  // meaning this is the code that the Java Virtual Machine looks for to start
  // running the program
  public static void main(String[] args) throws Exception {
    // System.out.println("Hello, World!");

    // creating an instance of the class App
    // new object representing an App
    App app = new App(); // this is an object

    app.printHello("Hello");
    app.printHello("Hi");
    app.printHello("What's up");

    // App.printHello("Hi");

  }

  public static void bubbleSort(int [] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length-1; j++){
        if(arr[ j ] > arr[ j+1 ]){                 //compare side by side
          swap(arr,j,j+1);                   //swap j with j+1 
        }
      }
    }
  }
  

  // METHODS
  public static void printHello() {
    System.out.println("This method is named 'printHello'");
    System.out.println("It has not params");
    System.out.println("Its only job is to print this info");
    System.out.println("Hello NEW");
  }

  public static void printHello(String greetings) {
    if (greetings == "Hello") {
      printHello();
      return;
    }
    System.out.println("This method is named 'printHello'");
    System.out.println("It has a parameter");
    System.out.println("Its only job is to print this info");
    System.out.println(greetings);
  }
}
