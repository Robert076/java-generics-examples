import java.util.ArrayList;

import Animal.Animal;
import Animal.Cat.Cat;
import Animal.Dog.Dog;

public class Main {
    static void howShout(ArrayList<? extends Animal> list) {
        for (Animal a : list) {
            System.out.println(a.shout());
        }
    }

    static void howShoutOnce(Animal a) {
        System.out.println(a.shout());
    }

    static <T> void printer(T a) {
        System.out.println(a);
    }

    static <T extends Animal> void printer2(T a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        // ArrayList<Animal> is NOT a parent of ArrayList<Dog>
        // even though Animal is a parent of Dog !!!
        // hence why we use Java's wildcards (?) because we do not know what will be in
        // our list
        // all we know is that there will be something that is below the Animal in the
        // hierarchy
        howShout(dogs);
        howShoutOnce(new Cat());

        printer(new Dog()); // WORKS
        printer(new Cat()); // WORKS
        printer(new String("Test")); // WORKS

        // Now change static <T> void printer(T a) and make <T extends Animal> instead
        // lets make a new function printer2 like this
        printer2(new Dog()); // WORKS
        printer2(new Cat()); // WORKS
        // printer2(new String("test")); // COMPILE ERROR
    }
}
