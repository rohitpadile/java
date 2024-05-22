import jdk.jshell.Snippet;

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int x=98;
//        int y=0;
//        System.out.println(divideLBYL(x,y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x,y));
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int divideLBYL(int x, int y) {
        if(y!=0) {
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try{
            return x/y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
    private static int divide(int x, int y) {
        return x/y;

    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() { //much much code
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() { //less code more efficient and quick!
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}