package main.java.core.level07;

/**
 * Заполнение двумерного массива последовательными числами от 1 до 12
 */
public class Example3_1 {
    public static void main(String[] args) {
        int matrix[][] = new int[3][4];
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = value;
                value++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

