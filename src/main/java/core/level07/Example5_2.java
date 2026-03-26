package main.java.core.level07;

import java.util.Arrays;

public class Example5_2 {
    public static void main(String[] args) {
        //Метод заполняет все элементы или указанную часть массива одним и тем же значением.

        int[] array = new int[5];
        Arrays.fill(array,5);
        System.out.println(Arrays.toString(array));

        //Заполнение части массива
        int[] array1 = new int[5];
        Arrays.fill(array1,1,3,7);
        System.out.println(Arrays.toString(array1));

        //Заполнение массива строк
        String[] array3 =new String[6];
        Arrays.fill(array3,"WORD");
        System.out.println(Arrays.toString(array3));
    }
}
