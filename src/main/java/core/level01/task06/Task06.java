package main.java.core.level01.task06;

/**
 * Представьте, что вы хотите узнать, сколько лет вашему проекту, который начался в 2019 году.
 * Объявите две переменные типа int: currentYear (присвойте ей значение 2025) и projectAge.
 * Присвойте переменной projectAge значение, равное разнице между currentYear и 2019.
 * Затем выведите на экран возраст проекта.
 * Требования:
 * •	В программе должна быть объявлена переменная типа int с именем currentYear и значением 2025.
 * •	В программе должна быть объявлена переменная типа int с именем projectAge.
 * •	Переменной projectAge должно быть присвоено значение, равное разности currentYear и 2019.
 * •	Программа должна вывести на экран значение переменной projectAge.
 */
public class Task06 {
    public static void main(String[] args) {
        int currentYear = 2025;
        int projectAge = currentYear - 2019;
        System.out.println(projectAge);
    }
}
