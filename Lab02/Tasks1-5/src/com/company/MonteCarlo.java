package com.company;

import java.util.Random;

public class MonteCarlo {

    private Figure figure = new Figure(1);

    public double randomMethod(int numberOfDraws) {

        int isInside = 0;
        double tempX, tempY;
        Random random = new Random();

        for(int i = 0; i < numberOfDraws; i++) {

            tempX = random.nextDouble();
            tempY = random.nextDouble();

            if(figure.isInside(tempX, tempY)) {
                isInside++;
            }
        }
        double ret = (double)(isInside*4)/numberOfDraws;

        return ret;
    }

}
