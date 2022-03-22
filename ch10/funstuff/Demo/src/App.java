public class App {
  public static void main(String[] args) throws Exception {

    Room room = new Room();
    Door door = new ExteriorDoor();
    // Door door = new InteriorDoor();
    room.lock(door);

  }
}
