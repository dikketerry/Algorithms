package io.eholland.service;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    int[] valueArray = new int[5];
    List<Integer> valueList = new ArrayList<>();

    // algo simulating getting cards (values) 1-by-1, sort them
    public double[] insertSort(double[] values) {
        for (int i = 1; i < values.length; i++) {
            double key = values[i];
            int j = i - 1;

            // values[j] > key = increasing / < key = decreasing
            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j = j - 1;
            }

            values[j + 1] = key;
        }
        return values;
    }

}
