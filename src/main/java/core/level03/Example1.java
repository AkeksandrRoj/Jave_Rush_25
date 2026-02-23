package main.java.core.level03;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = console.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = console.nextInt();

        if (age >= 21)
        {
            System.out.print("Введите пригласительный код: ");
            String code = console.nextLine();

            if (code.equals("VIP2024"))
            {
                System.out.println("Добро пожаловать, " + name + ", в VIP-клуб!");
            }
            else
            {
                System.out.println("Извините, неверный код. Доступ запрещён.");
            }
        }
        else
        {
            System.out.println("Извините, вход только с 21 года!");
        }
    }
}
