package main.java.core.level06.task109;

/**
 * Перекодировка секретных сообщений для шпиона 🕵️‍♀️
 * Вы — шпион-криптограф и вам необходимо освоить искусство перекодировки символов в числа и обратно.
 * Начните с объявления переменной типа char с именем secretAgentLetter и присвойте ей, скажем, символ 'G',
 * который является частью вашего шифра. Ваша первая миссия — раскрыть числовой код этого символа.
 * Преобразуйте secretAgentLetter в int, сохраните результат в numericCode, и выведите этот код на экран, чтобы ваш агент мог его записать.
 * Ваша вторая миссия — доказать, что вы можете восстановить символ из его кода.
 * Преобразуйте numericCode обратно в char, сохраните результат в decodedAgentLetter, и выведите этот восстановленный символ на экран, подтверждая успешную дешифровку.
 * <p>
 * Требования:
 * •	В программе должна быть объявлена переменная типа char с именем secretAgentLetter, которой присваивается символ 'G'.
 * •	Значение переменной secretAgentLetter должно быть преобразовано в тип int и сохранено в переменную numericCode.
 * •	Значение переменной numericCode должно быть выведено на экран.
 * •	Значение переменной numericCode должно быть преобразовано обратно в тип char и сохранено в переменную decodedAgentLetter.
 * •	Значение переменной decodedAgentLetter должно быть выведено на экран.
 */
public class Task109 {
    public static void main(String[] args) {
        char secretAgentLetter = 'G';
        int numericCode = secretAgentLetter;
        System.out.println(numericCode);
        char decodedAgentLetter = (char) numericCode;
        System.out.println(decodedAgentLetter);
    }
}
