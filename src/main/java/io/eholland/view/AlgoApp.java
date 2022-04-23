package io.eholland.view;

import io.eholland.service.Searching;
import io.eholland.service.Sorting;
import io.eholland.service.Util;

import java.util.Arrays;

public class AlgoApp {

    public static void main(String[] args) {
        Sorting sort = new Sorting();
        Searching search = new Searching();

        double[] a = {23, 54.0, 3.03, 87.1, 9, 611, 76.9, 4, 54, 8};
        int num = 4;
        String s1 = "100101001";
        String s2 = "011100111";

        // linear search
        System.out.println("index found for num " + num + ": " + search.linearSearch(a, num));

        // insert-sort
        System.out.println(Arrays.toString(a));         // prior to sort
        double[] aSorted = sort.insertSort(a);
        System.out.println(Arrays.toString(aSorted));   // after sort

        // sum of binary nrs - webzz method
        String sumString = Util.binaryAddition(s1, s2);
        System.out.println(sumString);

        // TODO: sum of binary nrs - own method
        int[] c = Util.stringToIntArray(s1);
        int[] d = Util.stringToIntArray(s2);
        int[] initSum = Util.setSumBinArray(c, d);
        int[] fillSum = Util.initializeSumBinArray(initSum);
        int[] cD = Util.alignLengthArray(fillSum, c);
        int[] dD = Util.alignLengthArray(fillSum, d);
        int[] finalSum = Util.sumBinaries(cD, dD, fillSum);
        System.out.println(Arrays.toString(finalSum));

    }
}
