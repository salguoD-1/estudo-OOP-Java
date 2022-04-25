public class AnimalClass {
    public static void main(String[] args) {
        // Criamos 3 objetos, myAnimal da superclasse Animal, myPig e myDog das subclasses Pig e Dog.
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        // Note que utilizamos o mesmo método da classe Animal, no entanto com valores implementações diferentes, por isso o de "muitas formas".
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}