package dev.lpa;

public class Main {
    public static void main(String... args) {
        System.out.println("Hello World Again");

        String[] splitStrings = "Hello World Again".split(" ");
        //split method splits parts into an array and returns it
        //join methods is reverse process: it concatenates parts of String and returns it.
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join("," , sArray));
    }

    private static void printText(String... textList) {
        for(String t : textList) {
            System.out.println(t);
        }
    }
}
