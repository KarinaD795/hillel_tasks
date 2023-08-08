package oop_practice.cat_dog.cat;

public class Cat extends oop_practice.cat_dog.animal.Animal {
    private String name;

    public Cat(String name) {
        super();

        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("I'am a Cat. My name is " + this.name + ". Mew");
    }
}



