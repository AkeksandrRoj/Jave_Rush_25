package main.java.core.level03.task48;

/**
 * Банк рассматривает вашу заявку на кредит по двум разным правилам.
 * yourAge = 25
 * hasJob = true
 * hasCreditHistory = false
 * hasGuarantor = true
 * Первое правило: Кредит одобрят, если «ваш возраст больше 21 и у вас есть работа» ИЛИ «у вас есть кредитная история и поручитель».
 * Второе правило: Кредит одобрят, если «ваш возраст больше 21» И «либо у вас есть работа, либо кредитная история» И «есть поручитель».
 * Создайте два выражения с учетом этих правил, выведите их результаты.
 * Требования:
 * •	В программе должны быть объявлены переменные yourAge (int), hasJob (boolean), hasCreditHistory (boolean), hasGuarantor (boolean) и им должны быть присвоены значения: 25, true, false, true соответственно.
 * •	Первое логическое выражение должно соответствовать правилу: (yourAge > 21 && hasJob) || (hasCreditHistory && hasGuarantor), с правильным использованием скобок для приоритета операций.
 * •	Второе логическое выражение должно соответствовать правилу: (yourAge > 21) && (hasJob || hasCreditHistory) && hasGuarantor, с правильным использованием скобок для приоритета операций.
 * •	Программа должна вывести на экран значения обоих логических выражений (результаты по двум правилам).
 */
public class Task48 {
    public static void main(String[] args) {
        int yourAge = 25;
        boolean hasJob = true;
        boolean hasCreditHistory = false;
        boolean hasGuarantor = true;
        boolean approveLoan = (yourAge > 21 && hasJob) || (hasCreditHistory && hasGuarantor); // true
        boolean approveLoan1 = (yourAge > 21) && (hasJob || hasCreditHistory) && hasGuarantor; //false
        System.out.println(approveLoan);
        System.out.println(approveLoan1);
    }
}
