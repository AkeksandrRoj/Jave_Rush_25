package main.java.core.level04;

/**
 * вывести на экран классическую шахматную доску в виде черных и белых клеток (пусть ‘#’ — черная, ‘.’ — белая).
 */
public class Example5_1 {
    public static void main(String[] args) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col)% 2 == 0)
                {
                    System.out.print(" . ");
                }else
                {
                    System.out.print(" # ");
                }
            }
            System.out.println();
        }
    }
}
