package Animal.Dog;

import Animal.Animal;

public class Dog implements Animal {

    @Override
    public String shout() {
        return "Dog is shouting!";
    }

    @Override
    public String eat() {
        return "Dog is eating.";
    }

}
