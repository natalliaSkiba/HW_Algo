package org.example;

public class HW3 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int k = 2;
        System.out.println(getElement(arr, k));
    }

    static int getElement(int[] arr, int k) {


        int counter = 0;

        int midlIdx = arr.length / 2;

        if (arr[midlIdx - 1] <= k) {
            for (int i = midlIdx - 1; i < arr.length && arr[i] <= k; i++) //правая часть
                if (arr[i] == k) {
                    counter++;
                }
        } else {
            for (int i = 0; i < midlIdx - 1 && arr[i] >= k; i++) {
                if (arr[i] == k) {
                    counter++;

                }
            }
        }

        return counter;
    }

}