package main.java.core.level07;

import java.util.Arrays;

public class Example5_1 {
    public static void main(String[] args) {
        // Сортировка int
        int[] array = {5, 7, 9, 11, 2, 4};
        Arrays.sort(array);
        System.out.println("Отсортированный массив array: " + Arrays.toString(array));

        // Сортировка String
        String[] name = {"Вася", "Петя", "Аня", "Игорь"};
        Arrays.sort(name);
        System.out.println("Отсортированный массив name: " + Arrays.toString(name));

        //Сортировка части массива
        int[] array1 = {5, 7, 2, 1, 2, 4,7,12};
        Arrays.sort(array1,1,4);
        System.out.println("Отсортированная часть массива array1: " + Arrays.toString(array1));
    }

}
