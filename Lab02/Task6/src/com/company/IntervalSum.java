package com.company;

public class IntervalSum {

    private int tabSize;
    private int[] tab = new int[tabSize];

    public IntervalSum(int tabSize, int[] tab) {
        this.tabSize = tabSize;
        this.tab = tab;
    }

    /** linear time */
    public int calculateSum(int start, int end) {
        int sum = 0;
        for(int i = start-1; i <= end-1; i++) {
            sum += tab[i];
        }
        return sum;
    }
}
