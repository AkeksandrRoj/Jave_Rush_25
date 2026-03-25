package main.java.core.level07;

/**
 * Заполнить массив и вывести на экран его содержимое
 */
public class Example4_1 {
    public static void main(String[] args) {
        int[][] jaggedArray = {
                {4,5,6},
                {7,5},
                {4}
        };
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // через for-each
        for(int array[]:jaggedArray){
            for (int val:array){
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
