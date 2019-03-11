package com.company;

public class Square extends Rectangle {
    public Square(double side) {
        sideA = side;
        sideB = side;
        calculateField();
        calculatePerimeter();
    }
}
