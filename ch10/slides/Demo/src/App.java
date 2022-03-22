public class App {
  public static void main(String[] args) throws Exception {

    Pet cat = new Cat();
    Pet dog = new Dog();
    Pet[] pets = { cat, dog };
    for (Pet pet : pets) {
      System.out.println(pet);
      pet.play();
      pet.eat();
    }

    // CANNOT instanciate Pet
    // Pet pet = new Pet();

    // Dog dog = new Dog();
    // AnotherDog adog = new AnotherDog();
    // Cat cat = new Cat();

    // App app = new App();
    // app.playPet(dog);
    // app.playPet(adog);
    // app.playPet(cat);
  }

  // public void playPet(Pet pet) {
  // // do a LOT of stuff
  // // 20 lines of code
  // // things that your code needs to do before calling play()
  // pet.play();
  // }
}
