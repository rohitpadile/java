package enums;

public class Client {

    static final String SUNDAY = "Sunday";
    static final int SUNDAY_Day = 1;
//    static final String SUNDAY = "Sunday";
//    static final String SUNDAY = "Sunday";
//    static final String SUNDAY = "Sunday";
    public static void main(String[] args) {


        System.out.println(DaysOfTheWeek.MONDAY.getShortName()); // mon
        System.out.println(DaysOfTheWeek.MONDAY.getDay()); // 2
        System.out.println(DaysOfTheWeek.MONDAY); // MONDAY

        System.out.println(DaysOfTheWeek.MONDAY); //MONDAY
        System.out.println(SUNDAY); //Sunday (declared in this class)

        String a = DaysOfTheWeek.MONDAY.toString();
        System.out.println(a);  //MONDAY
        System.out.println(DaysOfTheWeek.MONDAY);//MONDAY
        System.out.println(DaysOfTheWeek.MONDAY.name()); // MONDAY
        for(DaysOfTheWeek dayOfTheWeek : DaysOfTheWeek.values()) {
            System.out.println(dayOfTheWeek); //MONDAY
            System.out.println(dayOfTheWeek.getDay());  //2
            System.out.println(dayOfTheWeek.getShortName());    //mon
            System.out.println(dayOfTheWeek.ordinal()); //2
        };

        DaysOfTheWeek d = DaysOfTheWeek.valueOf("fghjsdf");
        DaysOfTheWeek d1 = DaysOfTheWeek.SUNDAY;

        System.out.println(d);
        // This line will throw a `java.lang.IllegalArgumentException` because there is no enum constant with the name : "fghjsdf".
        System.out.println(d1); //SUNDAY

        abc("MONDAY");
    }

    public static void abc(String dayName) {
        DaysOfTheWeek day = DaysOfTheWeek.valueOf(dayName); // DaysOfTheWeek.MONDAY

        DaysOfTheWeek[] days =  new DaysOfTheWeek[]{DaysOfTheWeek.MONDAY, DaysOfTheWeek.WEDNESDAY}; //sample ex: array of days
    }
}