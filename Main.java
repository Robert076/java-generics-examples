import java.util.ArrayList;

import Animal.Animal;
import Animal.Dog.Dog;

public class Main {
    static void howShout(ArrayList<? extends Animal> list) {
        for (Animal a : list) {
            System.out.println(a.shout());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        howShout(dogs);
    }
}
