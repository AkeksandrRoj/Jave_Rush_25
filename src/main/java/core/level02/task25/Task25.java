package main.java.core.level02.task25;

/**
 * Представьте, что вы создаете профиль для игрового персонажа. Объявите четыре переменные разных типов, чтобы хранить информацию о нём:
 * byte для его уровня (level)
 * int для количества золота (goldAmount)
 * double для его рейтинга (rating)
 * String для имени (characterName)
 * Присвойте им любые значения и выведите все данные на экран.
 * Требования:
 * •	В программе должны быть объявлены четыре переменные: одна типа byte (level), одна типа int (goldAmount), одна типа double (rating), одна типа String (characterName).
 * •	Каждой из переменных должно быть присвоено некоторое значение.
 * •	Переменные должны иметь имена: level, goldAmount, rating, characterName.
 * •	Все четыре значения переменных должны быть выведены на экран.
 */
public class Task25 {
    public static void main(String[] args) {
        byte level = 1;
        int goldAmount = 100;
        double rating = 4.75;
        String characterName = "Monna";
        System.out.println("level: " + level + "\n" + "goldAmount: " + goldAmount + "\n" + "rating: " + rating + "\n" + "characterName: " + characterName);

    }
}
