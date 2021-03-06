package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {11, -100, -99, 0, 22, 13, 88};
        int size = arr.length;

        for (int lastUnsorted = size - 1; lastUnsorted > 0; lastUnsorted--) {
            for (int i = 0; i < lastUnsorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }


    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
