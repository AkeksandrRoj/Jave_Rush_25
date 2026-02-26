package main.java.core.level04;

public class Example1_3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 2) {
                System.out.println("i = " + i + " " + "j = " + j);
                j++;
            }
            i++;
        }
    }
}
