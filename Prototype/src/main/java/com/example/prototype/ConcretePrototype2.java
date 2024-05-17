package com.example.prototype;

public class ConcretePrototype2 implements Prototype {
    private String name;

    public ConcretePrototype2(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(name);
    }

    public String getName() {
        return name;
    }
}
