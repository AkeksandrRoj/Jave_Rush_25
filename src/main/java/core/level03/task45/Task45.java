package main.java.core.level03.task45;

/**
 *Представьте, что вы планируете отпуск и выбираете, куда поехать: в горы ⛰️ или на море 🏖️.
 * Объявите три переменные типа boolean:
 * toTheSea (присвойте ей значение true)
 * hasPlaneTickets (присвойте ей значение false)
 * hasHotelRooms (присвойте ей значение true)
 * Для успешного отпуска вам нужно, чтобы было либо «море», либо «билеты на самолет и места в отеле».
 * Создайте выражение boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms; и выведите его результат на экран.
 * Требования:
 * •	В программе должны быть объявлены три переменные типа boolean: toTheSea, hasPlaneTickets и hasHotelRooms.
 * •	Переменной toTheSea должно быть присвоено значение true, hasPlaneTickets — значение false, hasHotelRooms — значение true.
 * •	Должно быть создано логическое выражение vacationHappened, использующее переменные и операторы || и &&: vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms.
 * •	В выражении vacationHappened необходимо использовать операторы без дополнительных скобок, чтобы продемонстрировать приоритет операторов && над ||.
 * •	Значение переменной vacationHappened должно быть выведено на экран
 */
public class Task45 {
    public static void main(String[] args) {
        boolean toTheSea = true;
        boolean hasPlaneTickets = false;
        boolean hasHotelRooms = true;
        boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms;
        System.out.println(vacationHappened);
    }
}
