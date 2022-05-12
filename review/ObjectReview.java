public class ObjectReview {
  
  private int number;
  
  public ObjectReview() {
    super();
    number = 7;
  }

  public void setNumber(int n) {
    this.number = n;
  }

  public int getNumber() {
    return this.number;
  }
  
  @Override
  public ObjectReview clone() {
    return this;
  }
  

  // Stack
  // or --> reference to or {instance} in the heap
  // cloned --> reference to or {instance} in the heap
  //  
  //  Heap
  //   or {instance}


  public static void main(String[] args) throws Exception {
    ObjectReview or = new ObjectReview();
    ObjectReview cloned = or.clone();
    System.out.println(or.getNumber());
    System.out.println(cloned.getNumber());
    cloned.setNumber(3);
    System.out.println(or.getNumber());
    System.out.println(cloned.getNumber());
  }
}
