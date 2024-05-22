// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
//        we cant do : ITelephone timsPhone = new DeskPhone(123456);
//        it will create a class here only using that interface
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
//      creating new instance of the same interface for the same object
//      and it does not give an error
        timsPhone = new MobilePhone(24565);
        // timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}