package io.eholland.service;

public abstract class Util {

    public static int[] stringToIntArray(String s) {
        int[] a = new int[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.charAt(i);
        }
        return a;
    }

    public static int[] setSumBinArray(int[] a, int[] b) {
        int[] sum;
        if (a.length >= b.length) {
            sum = new int[a.length + 1];
        } else {
            sum = new int[b.length + 1];
        }
        return sum;
    }

    public static int[] alignLengthArray(int[] sum, int[] arr) {
        int diff = sum.length - arr.length;
        int[] newArr = new int[sum.length - 1];
        if (diff > 1) {
            for (int i = 0; i < diff; i++) {
                newArr[i] = 0;
            }
            for (int j = 0; j < arr.length; j++) {
                newArr[j + diff] = arr[j];
            }
            arr = newArr;
        }
        return arr;
    }

    public static int[] initializeSumBinArray(int[] sum) {
        for (int i = 0; i < sum.length; i++) {
            sum[i] = 0;
        }
        return sum;
    }

    // own binarySum logic
    public static int[] sumBinaries(int[] a, int[] b, int[] sum) {
        int carryOver = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            sum[i] = (a[i] + b[i] + carryOver) % 2;
            carryOver = (a[i] + b[i] + carryOver) / 2;
        }
        sum[a.length] = carryOver;
        return sum;
    }

    // binarySum from the webzz
    public static String binaryAddition(String s1, String s2) {
        if (s1 == null || s2 == null) return "";
        int first = s1.length() - 1;
        int second = s2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += s1.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += s2.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');

        sb.reverse();
        return String.valueOf(sb);
    }
}
