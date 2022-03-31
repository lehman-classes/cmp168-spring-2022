import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    // it creates a handle to the file object
    // a new instance of a File is created (Not *real* digital file yet)
    File file = new File("abc");

    // boolean itExists = file.exists();
    // if (itExists) {
    // System.out.println("it exists");
    // } else {
    // try {
    // if (file.createNewFile()) {
    // System.out.println("file: " + file.getName() + " created.");
    // }
    // } catch (IOException e) {
    // System.out.println("couln't create the file at " + file.getPath());
    // }
    // }

    // OutputStream - out to the file system or any other system resource
    // FileOutputStream fileStream = new FileOutputStream("abc");
    // String hello = "hello";
    // fileStream.write(hello.getBytes());
    // fileStream.close();

    // FileInputStream is = new FileInputStream(fileStream.getFD());

    // InputStream - in into memory from any system resource like the keyboard
    // System.out.print("What's your name? ");
    // Scanner scanner = new Scanner(System.in);
    // String data = scanner.next();
    // System.out.println("Oh your name is " + data);

    // file should exists here
    // FileWriter writer = new FileWriter(file);
    // writer.write("hello");
    // writer.close();

    // writing
    PrintWriter pWriter = null;
    try {
      // pWriter = new PrintWriter(file);
      pWriter = new PrintWriter(new FileOutputStream(file, true));
      pWriter.println("hello");
    } catch (FileNotFoundException fnfe) {
      // TODO: handle exception
      System.out.println("file not found.");
    } finally {
      if (pWriter != null) {
        pWriter.close();
      }
    }

    // reading
    Scanner scanner = null;
    String content = "";
    try {
      scanner = new Scanner(file);
      while (scanner.hasNext()) {
        content = scanner.nextLine();
        System.out.println(content);
      }
    } catch (FileNotFoundException fnfe) {
      System.out.println("file not found.");
    } catch (Exception e) {
      System.out.println("something went really bad");
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }

    // System.out.print("What's your favorite number? ");
    // Scanner scanner = new Scanner(System.in);
    // int favoriteNumber = scanner.nextInt();
    // int newValue = favoriteNumber + 7;
    // System.out.println("new value is: " + newValue);
  }
}
