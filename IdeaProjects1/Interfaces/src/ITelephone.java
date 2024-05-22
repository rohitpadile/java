public interface ITelephone {
    //we dont need public keyword here
    //classes are going to define the methods
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
