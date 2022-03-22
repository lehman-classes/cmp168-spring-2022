public class Tester {

  public static void main(String[] args) {

    // Dog.Bones bones = new Dog.Bones();
    // BetterShowDog bsd = new BetterShowDog();

    // 1. Create 5 separate instances of the ShowDog using the default constructor.
    ShowDog showDog1 = new ShowDog();
    ShowDog showDog2 = new ShowDog();
    ShowDog showDog3 = new ShowDog();
    ShowDog showDog4 = new ShowDog();
    ShowDog showDog5 = new ShowDog();

     Dog dog = new Dog();
     Object obj;

    // 2. Set the name of each individual ShowDog object by using the mutator
    // methods from the parent class.
    showDog1.setName("Fluffy");
    showDog2.setName("Scotty");
    showDog3.setName("Stitch");
    showDog4.setName("Lo");
    showDog5.setName("Oakley");

    // 3. Set the weight and height on 2 of the ShowDog instances to values you deem
    // appropriate.
    showDog1.setWeight(28.2);
    showDog1.setHeight(4.3);
    showDog2.setWeight(12.4);
    showDog2.setHeight(7.3);

    // 4. Set the numTrophies and bestFeature on 2 of the ShowDog instances to
    // values you deem appropriate.
    showDog1.setNumTrophies(5);
    showDog1.setBestFeature("jump");
    showDog2.setNumTrophies(3);
    showDog2.setBestFeature("dance");

    // 5. Create 6 separate instances of the ShowDog using each of the 3 overloaded
    // constructors twice with different values.
    ShowDog showDog6 = new ShowDog("Marie");
    ShowDog showDog7 = new ShowDog(7, "smile");
    ShowDog showDog8 = new ShowDog("Blue", 54.1, 7.1, true, 12, 10, "talking");
    ShowDog showDog9 = new ShowDog("Ralphie");
    ShowDog showDog10 = new ShowDog(9, "run");
    ShowDog showDog11 = new ShowDog("Red", 45.2, 8.0, false, 1, 2, "singing");

    // 6. Create an array of ShowDog objects and initialize it to contain all the
    // ShowDogs
    ShowDog[] dogs = { showDog1, showDog2, showDog3, showDog4, showDog5, showDog6, showDog7, showDog8, showDog9,
        showDog10, showDog11 };

    // 7. Set values on the attributes for the ShowDog to valid and invalid values
    // to test the mutator methods.

    System.out.println("showDog1: " + (showDog1.isValid() ? "VALID " : "INVALID ") + showDog1.getNumTrophies());
    showDog1.setNumTrophies(-5);
    System.out.println("showDog1: " + (showDog1.isValid() ? "VALID " : "INVALID ") + showDog1.getNumTrophies());

    // 8. Iterate through the array and use the toString methods to print the
    // details from each of the ShowDog instances.
    for (ShowDog showDog : dogs) {
      System.out.println(showDog.toString());
    }
  }
}
