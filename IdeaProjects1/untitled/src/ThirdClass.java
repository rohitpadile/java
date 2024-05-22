public class ThirdClass {
    //Scope for the switch case

    public static void mMethod(int value) {

        switch (value) {
            case 1:
                //System.out.println(i); //This is not ok, i declared below
                break;
            case 2:
                int i=10;
                System.out.println(i); //this is ok
                break;
            case 3:
                i = value; //this is ok
                System.out.println(i); //this is ok
                break;
        }

        //System.out.println(i); //ERROR: i is out of scope outside of the switch
    }
}
