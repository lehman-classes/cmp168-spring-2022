public class Room {

  void lock(Door door) {

    if (door instanceof InteriorDoor) {
      System.out.println("this is an interior door");
    }
    if (door instanceof ExteriorDoor) {
      System.out.println("this is an exterior door");
    }

    if (isDoorValid(door)) {
      door.lock();
    }
  }

  void unlock(Door door) {
    if (isDoorValid(door)) {
      door.unlock();
    }

  }

  private boolean isDoorValid(Door door) {
    return (door instanceof InteriorDoor);

    // if(door instanceof InteriorDoor) {
    // return true;
    // }
    // return false;
  }

}
