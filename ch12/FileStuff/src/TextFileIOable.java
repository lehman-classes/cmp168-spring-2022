public interface TextFileIOable {

  public void createNewFile(String fileName);

  public void writeToNewFile(String fileName, String text);

  public void appendToFile(String fileName, String text);

  public String readFile(String fileName);

  public void readFileDisplayOnConsole(String fileName);

  public boolean copyFile(String origFileName);

  public boolean copyFile(String origFileName, String copiedFileName);

  public boolean deleteFile(String fileName);

  public void writeToFileFromKeyboard(String fileName);

  public boolean findAndReplaceContentInFile(String fileName, String originalText, String replacementText);

  public void readFileChosenUsingFileChooser();

}
