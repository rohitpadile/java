public class Bank { //Class is for BankAccount, not just Bank

    private int account_number = 0;
    private int balance = 0;
    private String name = "Unknowm";
    private String email = "xyz@gmail.com";

    public int getAccount_number() {
        return account_number;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Bank() {
        this(56789, "Default Name", "fefault@gmail.com", 200);
        //this() should be the first statement in the constructor.
        System.out.println("Empty Constructor created!");
    }
    //Constructor overloading
    public Bank(int account_number, String name, String email, int balance) {
        System.out.println("Constructor with parameters created.");
        this.account_number = account_number;
        this.email = email;
        this.name = name;
        this.balance = balance;
        //better than using setter in constructor.
    }

    public Bank(String name, String email) {
        this(23424,name,email , 4000);
//        this.name = name;
//        this.email = email;
    }

    public void deposit_money(int value) {
        this.balance += value;
        System.out.println("Successfully deposited Rs " + value + " in your account" );
        System.out.println("Current balance : " + this.balance);
    }

    public void withdraw_money(int value) {
        if(value > this.balance) {System.out.println("Not enough balance. You only have " + this.balance + " in your account. "); return;}
        this.balance -= value;
        System.out.println("Successfully withdrawen Rs " + value + " from your account" );
        System.out.println("Current balance : " + this.balance);
    }

}
