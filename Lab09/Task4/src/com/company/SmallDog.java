package com.company;

public class SmallDog implements CatalogueDog {
    @Override
    public boolean checkBelong(Dog d) {
        return d.getHeight() < 0.3;
    }
}
