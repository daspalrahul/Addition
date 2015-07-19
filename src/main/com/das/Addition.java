package com.das;

public class Addition {
    int val1;
    int val2;
    public Addition(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
    public Addition() {}

    public int add() {
        return val1+val2;
    }
}