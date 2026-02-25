package main.java.core.level03;

import java.util.Scanner;

/**
 * кроме приветствия, программа будет говорить пользователю, сколько лет ему будет через год, и указывать, будет ли он совершеннолетним.
 */
public class Example4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Как вас зовут ");
        String name = console.nextLine();
        System.out.print("Сколько вам лет? ");
        int age = console.nextInt();

        int futureAge = age + 1;

        String adult = (futureAge >= 18) ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println(name + " вам будет " + futureAge + " вы будете - " + adult);
    }
}
