package com.example.prototype;

public class ConcretePrototype1 implements Prototype {
    private String name;

    public ConcretePrototype1(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(name);
    }

    public String getName() {
        return name;
    }
}

