package main.java.core.level02.task31;

import java.util.Scanner;

/**
 * Вы работаете на кассе. Напишите программу, которая считывает с клавиатуры цену двух товаров и выводит на экран их общую стоимость.
 * Требования:
 * •	Программа должна использовать класс Scanner для считывания данных с клавиатуры.
 * •	Программа должна считать с клавиатуры два целых числа, каждое из которых представляет цену товара.
 * •	Программа должна корректно сложить две введённые цены.
 * •	Программа должна вывести на экран сумму двух введённых цен.
 */
public class Task31 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите цену первого товара: ");
        int price1 = console.nextInt();
        System.out.print("Введите цену второго товара: ");
        int price2 = console.nextInt();
        int sumTwoPrices = price1 + price2;
        System.out.println(sumTwoPrices);
    }
}
