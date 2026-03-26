package main.java.core.level07;

import java.util.Arrays;

public class Example5_3 {
    public static void main(String[] args) {
        //Копирование массива
        int[] arr = new int[5];
        Arrays.fill(arr,6);
        int[]copy = Arrays.copyOf(arr,8);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));
        //Уменьшение массива
        int[] shortCopy = Arrays.copyOf(arr,2);
        System.out.println(Arrays.toString(shortCopy));

        //копирование части массива
        int[] arr2 = {5,2,7,9,3,5};
        int[] arrCopy = Arrays.copyOfRange(arr2,2,4);
        System.out.println(Arrays.toString(arrCopy));
    }
}
