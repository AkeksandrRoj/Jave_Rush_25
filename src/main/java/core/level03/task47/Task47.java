package main.java.core.level03.task47;

/**
 * Чтобы попасть на закрытую вечеринку, нужно выполнить три условия:
 * hasInvitation (присвойте ей значение true)
 * dressCodeMet (присвойте ей значение false)
 * passwordIsCorrect (присвойте ей значение true)
 * Вы пройдете, только если все три условия верны. Создайте выражение boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;
 * Затем создайте еще два выражения, расставив скобки по-разному: (hasInvitation && dressCodeMet) && passwordIsCorrect и hasInvitation && (dressCodeMet && passwordIsCorrect).
 * Выведите результаты всех трех выражений.
 * Требования:
 * •	В программе должны быть объявлены и инициализированы три переменные типа boolean: hasInvitation (значение true), dressCodeMet (значение false), passwordIsCorrect (значение true).
 * •	Для определения допуска (admitted) должно быть использовано логическое выражение с оператором && между всеми тремя переменными.
 * •	Должны быть созданы два дополнительных логических выражения, в которых используются разные варианты расстановки скобок: (hasInvitation && dressCodeMet) && passwordIsCorrect и hasInvitation && (dressCodeMet && passwordIsCorrect).
 * •	Программа должна вывести значения всех трех логических выражений на экран.
 */
public class Task47 {
    public static void main(String[] args) {
        boolean hasInvitation = true;
        boolean dressCodeMet = false;
        boolean passwordIsCorrect = true;
        boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect; //false
        boolean admitted1 = (hasInvitation && dressCodeMet) && passwordIsCorrect; //false
        boolean admitted2 = hasInvitation && (dressCodeMet && passwordIsCorrect); //false
        System.out.println(admitted);
        System.out.println(admitted1);
        System.out.println(admitted2);
    }
}
