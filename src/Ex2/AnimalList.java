package Ex2;

import java.util.ArrayList;

public class AnimalList {

    private ArrayList<Animal> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAll() {
        for (Animal animal : animals) {
            System.out.println("Animal ID: " + animal.id);
            System.out.println("Source: " + animal.source);
            System.out.println("Date of Birth: " + animal.dateOfBirth);
            System.out.println("Color: " + animal.color);
            animal.makeSound();
            System.out.println("---------------");
        }
    }
}
