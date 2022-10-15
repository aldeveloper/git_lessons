package com.algorithm;

import java.util.Arrays;

public class SortLogic {

    public static int[] bubbleSort(int[] array){

        for(int i = 0; i < array.length; i++){
            for (int j = array.length-1; j > i; j--) {
                int k = 0;
                if(array[j] < array[i]){
                    k = array[j];
                    array[j] = array[i];
                    array[i] = k;
                }
            }
        }

        return array;
    }
}
