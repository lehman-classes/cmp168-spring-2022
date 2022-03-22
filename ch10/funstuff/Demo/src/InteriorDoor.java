public class InteriorDoor implements Door {

  @Override
  public void lock() {
    System.out.println("door locked");
  }

  @Override
  public void unlock() {
    System.out.println("door unlocked");
  }
}
