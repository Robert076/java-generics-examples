package Animal.Cat;

import Animal.Animal;

public class Cat implements Animal {

    @Override
    public String shout() {
        return "Cat is shouting!";
    }

    @Override
    public String eat() {
        return "Cat is eating.";
    }

    public String toString() {
        return "CatToString";
    }

}