public class StringMethods {

    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " +startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " +birthDate.substring(3,5));

        //below is a good method to create a symbol separated String.
        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);


        //below is not a good method
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);
        //below more efficient than the one above!!
        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);


        //method chaining below....
        newDate = "25".concat("/").concat("11").concat("/".concat("1982"));
        System.out.println("newDate = "  + newDate);

        System.out.println(newDate.replace("/","-"));
        System.out.println(newDate.replace("2","00"));

        System.out.println(newDate.replaceFirst("/","-")); //25-11/1982
        System.out.println(newDate.replaceAll("/","---")); //25---11---1982

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2)); //way to remove spaces from each line from multiline text value
        System.out.println("-".repeat(20));
    }
}
