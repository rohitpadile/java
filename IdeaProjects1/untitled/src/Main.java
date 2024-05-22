// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        for(int i=1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }, "05/11/1985", "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Examm 829");
        //recordStudent.setClassList(recordStudent.classList() + ", Java OCP Examm 829 ")

        //records are immutable

        System.out.println(pojoStudent.getName() + " is taking" +
                pojoStudent.getClassList());
        System.out.println(recordStudent .name() + " is taking" +
                recordStudent.classList());

       /* Car car = new Car();
        car.setMake("Porsche");
        //car.make = "Honda"; gives error
        car.setColor("Blue");
        car.setModel("Carrera");
        System.out.println("Make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setConvertible(false);
        targa.setModel("Targa");

        targa.describeCar();*/

        //Bank myAccount = new Bank();
        /*myAccount.setAccount_number(234243);  //these can be relpaced using constructors
        myAccount.setEmail("Rohitpadile@gmail.com");
        myAccount.setName("Rohit Padile");
        myAccount.setBalance(23323);*/
//        myAccount.deposit_money(1000);
//        myAccount.withdraw_money(1009);

//        Bank newAccount = new Bank("Rohit", "rohitp22.elec@coeptech.ac.in");
//        System.out.println("AccountNo: " + newAccount.getAccount_number() + "; name " + newAccount.getName() + "; email: " + newAccount.getEmail());

    }
}