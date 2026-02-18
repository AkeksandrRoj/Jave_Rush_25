package main.java.core.level02.task14;

/**
 * Вы записываете результаты бросков игральных костей. Создайте три переменные типа int: firstRoll, secondRoll и totalScore.
 * Присвойте переменной firstRoll значение 7, secondRoll — 3, а переменной totalScore — сумму двух первых переменных.
 * Выведите на экран значение переменной totalScore. Создание и присваивание должно быть выполнено в одной строке.
 * Требования:
 * •	В программе должны быть объявлены три переменные типа int: firstRoll, secondRoll и totalScore.
 * •	Каждая из переменных firstRoll, secondRoll и totalScore должна быть инициализирована значением сразу при объявлении (в одной строке).
 * •	firstRoll должен быть равен 7, secondRoll должен быть равен 3, totalScore должен быть равен сумме firstRoll и secondRoll.
 * •	На экран должно быть выведено значение переменной totalScore.
 */
public class Task14 {
    public static void main(String[] args) {
        int firstRoll = 7;
        int secondRoll = 3;
        int totalScore = firstRoll + secondRoll;
        System.out.println(totalScore);
    }
}
