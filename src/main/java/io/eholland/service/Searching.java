package io.eholland.service;

public class Searching {
    // linear search - returns the index in array of num or -1 if not found
    public int linearSearch(double[] values, double num) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
