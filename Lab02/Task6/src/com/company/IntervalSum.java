package com.company;

public class IntervalSum {

    private int tabSize;
    private int[] tab;
    private int[] prefixSum;

    public IntervalSum(int tabSize, int[] tab) {
        this.tabSize = tabSize;
        this.tab = tab;

        /** O(start+end) initialize tine */
        this.prefixSum = new int[tabSize+1];
        this.prefixSum[0] = 0;
        for(int i = 0; i < this.tabSize; i++) {
            this.prefixSum[i+1] = this.prefixSum[i] + this.tab[i];
            System.out.println("Dziala");
        }
    }

    /** O(start * end) time */
    public int calculateSum(int start, int end) {
        int sum = 0;
        for(int i = start-1; i <= end-1; i++) {
            sum += tab[i];
        }
        return sum;
    }

    /** O(1) time */
    public int calculateSumInConstTime(int start, int end) {
        return prefixSum[end] - prefixSum[start-1];
    }
}
