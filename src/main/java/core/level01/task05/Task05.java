package main.java.core.level01.task05;

/**
 * Создайте переменную типа String с именем myMessage. Присвойте ей значение "I ❤️ YOU". Выведите это сообщение на экран.
 *
 * Требования:
 * •	В программе должна быть объявлена переменная типа String.
 * •	Переменная должна иметь имя myMessage.
 * •	Переменной myMessage должно быть присвоено значение "I ❤️ YOU".
 * •	Значение переменной myMessage должно быть выведено на экран.
 */
public class Task05 {
    public static void main(String[] args) {
        String myMessage = "I ❤\uFE0F YOU";
        System.out.println(myMessage);
    }
}
