package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("I'am a " + (this.getClass().getSimpleName()) + ". My name is " + this.name + ". Mew");
    }
}



