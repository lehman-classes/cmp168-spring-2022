public class Tester {

  public static void main(String[] args) {

    // 1. Create 3 separate instances of a Dog using the default constructor.
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();

    // 2. Create 3 separate instances of a Cat using the default constructor.
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();

    // 3. Set the name of each individual Dog and Cat object by using the mutator
    // methods.
    dog1.setName("Stich");
    dog2.setName("Oakley");
    dog3.setName("Lo");

    cat1.setName("Twinkle");
    cat2.setName("Tommy");
    cat3.setName("Mr. Roger");

    // 4. Set the weight and height on 2 of the Dog instances to values you deem
    // appropriate.
    dog1.setWeight(30.0);
    dog1.setHeight(2.1);
    dog2.setWeight(50.0);
    dog2.setHeight(4.5);

    // 5. Set the numWhiskers and whiskerLength on 2 of the Cat instances.
    cat1.setNumWhiskers(6);
    cat1.setWhiskerLength(1);
    cat2.setNumWhiskers(10);
    cat2.setWhiskerLength(3);

    // 6. Use the accessor/getter methods to print the details from each of the Dog
    // and Cat instances.
    // System.out.println("Dog 1: name: "
    // + dog1.getName()
    // + " weight: " + dog1.getWeight()
    // + " height: " + dog1.getHeight()
    // + " isVaccinated: " + dog1.isVaccinated()
    // + " ageInDogYears: " + dog1.getAgeInDogYears());
    // System.out.printf("Dog 2: name: %s weight: %.2f height: %.2f isVaccinated: %s
    // ageInDogYears: %d\n", dog2.getName(),
    // dog2.getWeight(), dog2.getHeight(), dog2.isVaccinated(),
    // dog2.getAgeInDogYears());
    // System.out.printf("Dog 3: name: %s weight: %.2f height: %.2f isVaccinated: %s
    // ageInDogYears: %d\n", dog3.getName(),
    // dog3.getWeight(), dog3.getHeight(), dog3.isVaccinated(),
    // dog3.getAgeInDogYears());

    // System.out.printf("Cat 1: name: %s numWhiskers: %d whiskerLength: %.2f age:
    // %d isVaccinated: %s\n", cat1.getName(),
    // cat1.getNumWhiskers(), cat1.getWhiskerLength(), cat1.getAge(),
    // cat1.getIsVaccinated());
    // System.out.printf("Cat 2: name: %s numWhiskers: %d whiskerLength: %.2f age:
    // %d isVaccinated: %s\n", cat2.getName(),
    // cat2.getNumWhiskers(), cat2.getWhiskerLength(), cat2.getAge(),
    // cat2.getIsVaccinated());
    // System.out.printf("Cat 3: name: %s numWhiskers: %d whiskerLength: %.2f age:
    // %d isVaccinated: %s\n", cat3.getName(),
    // cat3.getNumWhiskers(), cat3.getWhiskerLength(), cat3.getAge(),
    // cat3.getIsVaccinated());

    // 7. Set values on the other attributes for the Dog and Cat instances as well
    // if you like.
    dog1.setAgeInDogYears(4);
    dog1.setVaccinated(true);
    dog2.setAgeInDogYears(7);
    dog3.setAgeInDogYears(9);
    dog3.setVaccinated(true);
    cat1.setAge(9);
    cat1.setIsVaccinated(true);
    cat2.setAge(8);
    cat3.setAge(5);
    cat3.setIsVaccinated(true);

    // 8. Use if statements to test your methods and print “FAILED” or “SUCCESS”
    // depending on whether the values set to the object’s attributes, match the
    // values returned when using the accessor methods.
    if (dog1.getName().equals("Stich")) {
      System.out.println("SUCCESS");
    } else {
      System.out.println("FAILURE");
    }

    System.out.println(dog1.toString());
    System.out.println(dog2.toString());
    System.out.println(dog3.toString());
    System.out.println(cat1.toString());
    System.out.println(cat2.toString());
    System.out.println(cat3.toString());

  }
}