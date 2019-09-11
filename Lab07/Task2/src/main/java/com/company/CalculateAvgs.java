package com.company;

public class CalculateAvgs {
    NumbersProvider numbersProvider;

    public CalculateAvgs(NumbersProvider numbersProvider) {
        this.numbersProvider = numbersProvider;
    }

    public double calculateAvg() {
        double sum = 0;
        for(String i : numbersProvider.getFirstLine()) {
            sum += Double.parseDouble(i);
        }
        return sum/numbersProvider.getFirstLine().size();
    }

    public double calculateGeometric() {
        double product = 1;
        for(String i : numbersProvider.getSecondLine()) {
            product *= Double.parseDouble(i);
        }
        return Math.pow(product, (double)1/(double)numbersProvider.getSecondLine().size());
    }

    public double calculateHarmonic() {
        double sum = 0;
        for(String i : numbersProvider.getThirdLine()) {
            sum += (double)1/Double.parseDouble(i);
        }
        return (double)numbersProvider.getThirdLine().size()/sum;
    }
}
