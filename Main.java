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
        // if we have a simple type not a list or whatever we do not need to add for
        // example:
        // func(T extends Animal). This is wrong. we just add (Animal a) and the
        // compiler
        // will know that there can be anything that implements Animal. in this case
        // dogs or cats
        howShout(dogs);
        howShoutOnce(new Cat());
    }
}
