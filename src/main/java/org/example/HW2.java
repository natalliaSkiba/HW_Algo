package org.example;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{100, 112, 256, 349, 770};
        int[] arr2 = new int[]{72, 86, 113, 119, 265, 445, 892};
        int[] result = mergerArrays(arr1, arr2);
        int k = 256;

        System.out.println("Result = " + Arrays.toString(result) + " position k = " + getElementPosition(result, k));


    }

    static int[] mergerArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < res.length; k++) {
            if ((i > arr1.length - 1) || (arr1[i] > arr2[j])) {
                res[k] = arr2[j];
                j++;
            } else if ((j > arr2.length) || (arr1[i] < arr2[j])) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
        }
        return res;
    }

    static int getElementPosition(int[] res, int k) {
        int j = -1;
        for (int i = 0; i < res.length; i++)
            if (res[i] == k) {
                j = i + 1;
                break;
            }
        return j;
    }

}
