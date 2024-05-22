public class FirstClass {
    public static void main(String[] args) {
        /*double varDouble = 20.00;
        double varDouble2 = 91.00;
        double result1 = (varDouble2 + varDouble) * 100d;
        double remainder = result1%40.00d;
        boolean isNoRemainder = (remainder==0) ? true : false;
        System.out.println(isNoRemainder);
        if(!isNoRemainder) System.out.println("Got some remainder");*/

        int switchValue =2;
        switch (switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2: case 3: case 4:
                System.out.println("Value is 2 or 3 or 4");
                System.out.println("Actually value is 2");
            case 5:
                System.out.println("The value is 5");
            default:
                System.out.println("We are in Default");
        }

        System.out.println("We are out of switch");

        String month = "JANUARY";
        System.out.println("The Month January is in the quarter " + getQuarter(month));
    }



    public static String getQuarter(String month) {
        return switch(month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st";} //returns 1st
            case "APRIL", "MAY", "JUNE" -> "2nd"; //returns 2nd
            default -> {
                String badResponse = month + " is bad!";
                yield badResponse; //returns badResponse.
            }//yield is a special keyword for the Switch Case.
        };
    }
}
