package main.java.core.level03.task35;

/**
 * Вы разрабатываете простую систему входа. Объявите переменную String userPassword и присвойте ей значение "qwerty".
 * Используйте оператор if без else, чтобы вывести "Вход выполнен успешно", если userPassword равен "qwerty".
 * Если пароль неверный, программа ничего не должна делать.
 * Требования:
 * •	В программе должна быть объявлена переменная типа String с именем userPassword.
 * •	Переменной userPassword должно быть присвоено значение "qwerty".
 * •	Для проверки значения переменной userPassword должен использоваться оператор if без блока else.
 * •	В условии оператора if необходимо сравнить значение userPassword со строкой "qwerty".
 * •	Если значение переменной userPassword равно "qwerty", программа должна вывести на экран строку "Вход выполнен успешно".
 * •	Если значение переменной userPassword не равно "qwerty", программа не должна выводить никакие сообщения.
 */
public class Task35 {
    public static void main(String[] args) {
        String userPassword = "qwerty";
        if (userPassword.equals("qwerty")) {
            System.out.println("Вход выполнен успешно");
        }
    }
}
