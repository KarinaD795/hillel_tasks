package oop_practice.cat_dog.animal;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    public abstract void sound();
}
