package oop_practice.cat_dog.dog;

public class Dog extends oop_practice.cat_dog.animal.Animal {
    private String name;

    public Dog(String name) {
        super();

        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("I'am a Dog. My name is " + this.name + ". Gav");
    }
}
