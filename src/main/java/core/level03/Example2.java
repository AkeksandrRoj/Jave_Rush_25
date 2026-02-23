package main.java.core.level03;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = console.nextInt();
        console.nextLine();
        double discount = 0.0;

        if (age >= 60)
        {
            discount = 0.15;
        }
        else
        {
            System.out.print("Есть ли у вас клубная карта (да/нет)? ");
            String hasCard = console.nextLine();

            if (hasCard.equals("да"))
            {
                discount = 0.07;
            }
        }

        System.out.println("Ваша скидка: " + (discount * 100) + "%");

    }
}
