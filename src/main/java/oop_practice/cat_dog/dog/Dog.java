package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {

    public Dog(String name) {
        this.setName(name);
    }

    public void sound() {
        System.out.println("I'am a " + (this.getClass().getSimpleName()) + ". My name is " + this.getName() + ". Gav");
    }
}
