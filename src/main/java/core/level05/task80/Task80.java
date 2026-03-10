package main.java.core.level05.task80;

import java.util.Scanner;

/**
 * Вы организатор соревнований по поиску золотого кубка.
 * Участникам предстоит пройти три разных пути, и чтобы определить победителя в напряжённой гонке,
 * вам нужно найти самый короткий путь. Каждый путь имеет свою уникальную продолжительность в минутах.
 * Ваша программа должна принять три числовых значения (например, pathOne, pathTwo, pathThree),
 * представляющих продолжительность каждого пути. Затем она должна мгновенно определить,
 * какой из этих путей является наименьшим по времени, и вывести это минимальное значение на экран.
 * Это позволит объявить чемпиона по самому быстрому прохождению!
 * Требования:
 * •	Программа должна принимать на вход три числовых значения, каждое из которых представляет продолжительность одного из трёх путей.
 * •	Программа должна определить, какое из трёх введённых значений является наименьшим.
 * •	Программа должна вывести на экран минимальное значение из трёх введённых чисел.
 * •	Программа должна корректно работать с целыми числами, представляющими минуты.
 */
public class Task80 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int pathOne = console.nextInt();
        int pathTwo = console.nextInt();
        int pathThree = console.nextInt();
        if (pathOne <= pathTwo && pathOne <= pathThree) {
            System.out.println(pathOne);
        } else if (pathTwo <= pathOne && pathTwo <= pathThree) {
            System.out.println(pathTwo);

        } else {
            System.out.println(pathThree);
        }
    }
}

/**
 *    Решение от JAVA RUSH
 *  // Создаём Scanner для чтения данных с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Считываем три целых числа — длительности трёх путей в минутах
 *         int pathOne = console.nextInt();
 *         int pathTwo = console.nextInt();
 *         int pathThree = console.nextInt();
 *
 *         // Определяем минимальную длительность среди трёх значений
 *         int minTwo = (pathOne < pathTwo) ? pathOne : pathTwo;
 *         int minDuration = (minTwo < pathThree) ? minTwo : pathThree;
 *
 *         // Выводим результат
 *         System.out.println(minDuration);
 */