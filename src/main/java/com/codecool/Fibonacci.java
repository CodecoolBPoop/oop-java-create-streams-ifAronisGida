package com.codecool;

import java.util.function.IntSupplier;

public class Fibonacci implements IntSupplier {
    int previous = 0;
    int current = 1;

    @Override
    public int getAsInt() {
        int temp = previous + current;
        previous = current;
        current = temp;
        return current;
    }
}
