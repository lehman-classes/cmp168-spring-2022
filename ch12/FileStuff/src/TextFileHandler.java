import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileHandler implements TextFileIOable {

  @Override
  public void appendToFile(String fileName, String text) {
    PrintWriter outStream = null;// notice this is not inside the try block
    try {
      outStream = new PrintWriter(new FileOutputStream(fileName, true));// connect to end of file
      outStream.println(text);// write text to file
    } catch (FileNotFoundException e) {
      System.err.println("Could not create the file " + fileName);
      e.printStackTrace();
    } finally {
      if (outStream != null) {
        outStream.close();// close the stream and release resources
      }
    }
  }

  @Override
  public boolean copyFile(String origFileName) {
    return copyFile(origFileName, "copy-" + origFileName);
  }

  @Override
  public boolean copyFile(String origFileName, String copiedFileName) {
    Scanner reader = null;
    PrintWriter writer = null;
    try {
      reader = new Scanner(new File(origFileName));
      writer = new PrintWriter(new File(copiedFileName));
      while (reader.hasNext()) {
        writer.println(reader.nextLine());
      }
      return true;
    } catch (FileNotFoundException fnfe) {
      System.out.println("file not found.");
    } catch (Exception e) {
      System.out.println("something went really bad");
    } finally {
      if (reader != null) {
        reader.close();
      }
      if (writer != null) {
        writer.close();
      }
    }
    return false;
  }

  @Override
  public void createNewFile(String fileName) {
    PrintWriter outStream = null; // notice this is not inside the try block
    try {

      outStream = new PrintWriter(fileName); // create and connect to a new empty file

    } catch (FileNotFoundException e) {
      System.err.println("Could not create the file " + fileName);
      e.printStackTrace();
    } finally {
      if (outStream != null) {
        outStream.close(); // close the stream and release resources
      }
    }
  }

  @Override
  public boolean deleteFile(String fileName) {
    File theFile = new File(fileName);
    if (theFile.exists()) {
      if (theFile.delete()) {
        System.out.println("The file " + fileName + " was deleted successfully");
        return true;
      } else {
        System.out.println("The file " + fileName + " could NOT be deleted");
      }
    } else {
      System.out.println("The file " + fileName + " doesn't seem to exist");
    }
    return false;
  }

  @Override
  public boolean findAndReplaceContentInFile(String fileName, String originalText, String replacementText) {

    Scanner reader = null;
    PrintWriter writer = null;
    try {
      reader = new Scanner(new File(fileName));
      writer = new PrintWriter(new File(fileName));
      while (reader.hasNext()) {
        String line = reader.nextLine();
        if (line.contains(originalText)) {
          // replace originalText with replacementText here
          // write new update line back to file
          // line = "update text";
        }
        String hello = "hello world";
        // replace world for class
        writer.println(line);
      }
      return true;
    } catch (FileNotFoundException fnfe) {
      System.out.println("file not found.");
    } catch (Exception e) {
      System.out.println("something went really bad");
    } finally {
      if (reader != null) {
        reader.close();
      }
      if (writer != null) {
        writer.close();
      }
    }

    return false;
  }

  @Override
  public String readFile(String fileName) {
    Scanner reader = null;
    String content = "";
    try {
      reader = new Scanner(new File(fileName));
      while (reader.hasNext()) {
        content += reader.nextLine() + "\n";
      }
      return content;
    } catch (FileNotFoundException fnfe) {
      System.out.println("file not found.");
    } catch (Exception e) {
      System.out.println("something went really bad");
    } finally {
      if (reader != null) {
        reader.close();
      }
    }
    return null;
  }

  @Override
  public void readFileChosenUsingFileChooser() {
    // TODO Auto-generated method stub

  }

  @Override
  public void readFileDisplayOnConsole(String fileName) {
    // TODO Auto-generated method stub

  }

  @Override
  public void writeToFileFromKeyboard(String fileName) {
    // TODO Auto-generated method stub

  }

  @Override
  public void writeToNewFile(String fileName, String text) {
    PrintWriter outStream = null;// notice this is not inside the try block
    try {
      outStream = new PrintWriter(fileName);// create and connect to a new empty file
      outStream.println(text);// write text to the file
    } catch (FileNotFoundException e) {
      System.err.println("Could not create the file " + fileName);
      e.printStackTrace();
    } finally {
      if (outStream != null) {
        outStream.close();// close the stream and release resources
      }
    }
  }

}
