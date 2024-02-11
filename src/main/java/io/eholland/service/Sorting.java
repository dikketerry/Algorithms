package io.eholland.service;

// import java.util.ArrayList;
// import java.util.List;

public class Sorting {
    // int[] valueArray = new int[5];
    // List<Integer> valueList = new ArrayList<>();

    // insertion sort algo: sorts elements by comparing element to other elements,
    // moves elements 1 place to the right, as long as required and then inserts at
    // the correct index element
    public double[] insertSort(double[] values) {
        for (int i = 1; i < values.length; i++) {
            double key = values[i];
            int j = i - 1;

            // values[j] > key = increasing order / < key = decreasing order
            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j = j - 1;
            }

            values[j + 1] = key;
        }
        return values;
    }

}
