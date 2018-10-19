package com.morronel;

public class Counter {

    int value;
    boolean check;

    public Counter() {
        value = 0;
    }

    public Counter(int startingValue, boolean check) {
        if (check) {
            value = startingValue;
        }
    }

    public Counter(int startingValue) {
        value = startingValue;
    }

    public Counter(boolean check) {
        if (check) {
            value = 0;
        }
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            value += increaseAmount;
        }
    }

    public void decrease() {
        if (check) {
            if (value-- >= 0) {
                value--;
            }
        }
        else {
            value--;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount >= 0) {
            if (check) {
                if ((value - decreaseAmount) >= 0) {
                    value -= decreaseAmount;
                }
            }
            else {
                value -= decreaseAmount;
            }
        }
    }

}
