package Ex2;

import java.util.Date;

public class Processor {

    public static void main(String[] args) {
        
        Dog dog = new Dog("Dog1", "Duoc", new Date(121, 1, 25), "Black", "Chihuahua");
        Cat cat = new Cat("Cat1", "Duoc ngu", new Date(122, 4, 14), "White");

        AnimalList animalList = new AnimalList();

        if (dog instanceof Animal) {
            animalList.addAnimal(dog);
        }
        if (cat instanceof Animal) {
            animalList.addAnimal(cat);
        }

        animalList.displayAll();
    }
}
