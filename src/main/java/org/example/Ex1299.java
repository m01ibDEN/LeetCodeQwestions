package org.example;

public class Ex1299 {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        for(int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] > max) max = arr[j];
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
