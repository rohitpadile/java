import dev.lpa.DayOfTheWeek;
import dev.lpa.Topping;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

//        System.out.printf("Name is %s, Ordinal Value = %d%n",
//                weekDay.name(), weekDay.ordinal()); //ordinal value = 2

        for(int i=0; i < 10; i++) {
            weekDay = getRandomDay();
//            System.out.printf("Name is %s, Ordinal Value = %d%n",
//                    weekDay.name(), weekDay.ordinal());
//            if(weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a Friday!!!");
//            }
            switchDayOfWeek(weekDay);
        }
        System.out.println(".".repeat(25));
        for(Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }

    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
//using switch case (using enum)
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }

}