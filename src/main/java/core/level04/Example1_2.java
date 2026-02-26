package main.java.core.level04;

import java.util.Scanner;

public class Example1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String password = "";
        while (!password.equals("aaa")) {
            System.out.println("Введите пароль: ");
            password = console.nextLine();
        }
        System.out.println("Добро пожаловать!");
    }
}
