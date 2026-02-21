package main.java.core.level02.task26;

/**
 * Вы создаете копию названия проекта, чтобы внести в неё изменения.
 * Создайте переменную String projectName и присвойте ей значение "Java".
 * Затем создайте другую переменную String newProjectName и присвойте ей значение projectName.
 * После этого измените newProjectName на "Java Programming".
 * Выведите значения обеих переменных на экран.
 * Требования:
 * •	В программе должна быть объявлена переменная типа String с именем projectName.
 * •	Переменной projectName должно быть присвоено значение "Java".
 * •	В программе должна быть объявлена переменная типа String с именем newProjectName, которой сразу присваивается значение переменной projectName.
 * •	Значение переменной newProjectName должно быть изменено на "Java Programming" после присваивания projectName.
 * •	Программа должна вывести на экран значения обеих переменных: сначала projectName, затем newProjectName (или наоборот, но оба значения должны быть видны).
 */
public class Task26 {
    public static void main(String[] args) {
        String projectName = "Java";
        String newProjectName = projectName;
        newProjectName = "Java Programming";
        System.out.println(projectName);
        System.out.println(newProjectName);
    }
}
