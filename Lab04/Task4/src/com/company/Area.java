package com.company;

import java.util.ArrayList;
import java.util.List;

public class Area {

    private List<Figure> figureList = new ArrayList<>();

    public Area() { }

    public Area(List<Figure> figureList) {
        this.figureList = figureList;
    }

    public void addFigure(Figure f) {
        figureList.add(f);
    }

    public double calculateWholeField() {

        double field = 0;
        for(Figure i : figureList) {
            field += i.calculateField();
        }

        return field;
    }
}
