package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Area area = new Area();
        Random generator = new Random();

        for(int i = 1; i <= 10; i++) {
            int tmp = generator.nextInt(3);
            System.out.println(tmp);
            if(tmp == 0) {
                double tmpSide = generator.nextDouble()*100;
                Figure f = new Square(tmpSide);
                area.addFigure(f);
            } else if(tmp == 1) {
                double tmpSideA = generator.nextDouble()*100;
                double tmpSideB = generator.nextDouble()*100;
                Figure f = new Rectangle(tmpSideA, tmpSideB);
                area.addFigure(f);
            } else {
                Figure f = new Triangle(i, i, Math.sqrt(i));
                area.addFigure(f);
            }
        }

        System.out.println(area.calculateWholeField());
    }
}
