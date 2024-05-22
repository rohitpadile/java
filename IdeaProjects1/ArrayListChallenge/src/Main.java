import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag) {
            printAction();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default ->  flag = false;
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for(String i: items) {
            String trimmed = i.trim(); //remove white space
            if(groceries.indexOf(trimmed) < 0) { //returns -1 if not present in array
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));

        for(String i: items) {
            String trimmed = i.trim(); //remove white space
            groceries.remove(trimmed);
        }
    }

    private static void printAction() {
        String textBlock = """
                Available actions:
                                
                0 - To shutdown
                                
                1 - To add item(s) to list (comma delimited list)
                                
                2 - To remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock +  " ");
    }
}