package main.java.core.level06.task92;

/**
 * Создание инвентаря для героя RPG
 * Представьте, что вы — разработчик новой, захватывающей ролевой игры.
 * Вам нужно создать базовый инвентарь для вашего первого героя, чтобы отслеживать его характеристики.
 * Для этого объявите несколько переменных с различными числовыми типами и присвойте им стартовые значения.
 * Создайте переменную byte characterLevel для уровня персонажа, short armorRating для показателя брони,
 * int experiencePoints для накопленного опыта, long goldCoins для несметных сокровищ,
 * float magicResistance для сопротивления магии (может быть дробным!),
 * и double criticalHitChance для шанса критического удара (требует высокой точности).
 * После присвоения значений с гордостью выведите всю эту жизненно важную статистику на экран, убедившись, что каждая из них отображается на новой строке, чтобы каждый мог восхититься силой вашего героя!
 * Требования:
 * •	В программе должны быть объявлены переменные: characterLevel типа byte, armorRating типа short, experiencePoints типа int, goldCoins типа long, magicResistance типа float, criticalHitChance типа double.
 * •	Каждой из перечисленных переменных должно быть присвоено стартовое значение.
 * •	Все переменные должны быть выведены на экран.
 * •	Каждая переменная должна выводиться на отдельной строке.
 */
public class Task92 {
    public static void main(String[] args) {
        byte characterLevel = 10;
        short armorRating = 22;
        int experiencePoints = 500;
        long goldCoins = 100_100_111_111L;
        float magicResistance = 1258.1547f;
        double criticalHitChance = 1478963.2587;
        System.out.println(characterLevel);
        System.out.println(armorRating);
        System.out.println(experiencePoints);
        System.out.println(goldCoins);
        System.out.println(magicResistance);
        System.out.println(criticalHitChance);
    }
}
