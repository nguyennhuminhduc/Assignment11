package Ex2;

import java.util.Date;

public class Animal {

    String id;
    String source;
    Date dateOfBirth;
    String color;

    public Animal(String id, String source, Date dateOfBirth, String color) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound: ");
    }
}

    
