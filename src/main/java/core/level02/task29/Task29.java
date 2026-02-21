package main.java.core.level02.task29;

import java.util.Scanner;

/**
 * Вы разрабатываете систему входа. Напишите программу, которая считывает пароль (одну строку текста) с клавиатуры и выводит его на экран для подтверждения.
 * Требования:
 * •	Программа должна использовать класс Scanner для чтения данных с клавиатуры.
 * •	Пароль должен считываться как строка методом nextLine().
 * •	Программа должна вывести на экран введённый пользователем пароль.
 * •	Программа должна считать и вывести только одну строку, соответствующую введённому паролю.
 */
public class Task29 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = console.nextLine();
        System.out.println(password);
    }
}
