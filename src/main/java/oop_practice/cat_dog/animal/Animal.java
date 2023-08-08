package oop_practice.cat_dog.animal;

public abstract class Animal {
    private String name;

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }
    public abstract void sound();
}
