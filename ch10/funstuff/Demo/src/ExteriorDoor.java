public class ExteriorDoor implements Door {

  @Override
  public void lock() {
    System.out.println("EXT door locked");
  }

  @Override
  public void unlock() {
    System.out.println("EXT door unlocked");
  }

}
