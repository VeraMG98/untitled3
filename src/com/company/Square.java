package com.company;

public class Square extends Polygon {
    public Square(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(getName() + " ⬛");
    }
}
