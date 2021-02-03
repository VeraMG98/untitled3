package com.company;

public class Triangle extends Polygon {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(getName() + " \uD83D\uDD3A");
    }
}
