import extra.Class1;
import extra.Class2;

public class Main {
    public static void main(String[] args) {
        Class1 x = new Class2();
        ((Class2) x).B(); //changes signature of x from Class1 to Class2
    }
}