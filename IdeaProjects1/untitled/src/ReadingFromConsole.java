
import java.util.Scanner;
public class ReadingFromConsole {
    public static void main(String[] args) {
        int currentYear = 2022;
        try {
            System.out.println(getInputFromConsole(currentYear)); //This is running
        } catch(NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear)); //This does nothing till scanner code is written.
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name =System.console().readLine("What is your Name?");
        System.out.println("Hi " + name + ", Thanks for taking the course");

        String dateOfBirth = System.console().readLine("What year you were born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }


    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in); //Created a new instance of scanner.

        //String name =System.console().readLine("What is your Name?");
        System.out.println("What is your Name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course");

        System.out.println("What year you were born?");
        //String dateOfBirth = scanner.nextLine();
        //String dateOfBirth = System.console().readLine("What year you were born?");

        boolean validDOB = false;
        int age=0;


        do{
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        //age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);

        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);


    }
}
