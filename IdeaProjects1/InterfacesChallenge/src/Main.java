import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Player tim = new Player("Tim", 10, 15);
//        System.out.println(tim.toString());
//        saveObject(tim);

////some code methods are missing - saveObjects, loadObjects

//        tim.setHitPoints(8);
//        System.out.println(tim);
//        tim.setWeapon("Stormbringer");
//        saveObject(tim);
//        loadObject(tim);
//        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf",20,40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
//        System.out.println(werewolf);
        saveObject(werewolf);
    }

    private static void saveObject(ISaveable werewolf) {
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while(!quit) {
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}