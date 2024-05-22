public class NextMain {
    public static void main(String[] args) {
//Lecture - 109 - Casting with classes and using Object and var references
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Movie comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();
        /*
        * Let's break it down: the above 3 Lines!

    Object comedy = Movie.getMovie("C", "Airplane");

    It seems you are retrieving a movie object using a
    method called getMovie from the Movie class.
    The type of the variable comedy is declared as Object,
    which means it can refer to any type of object.
    Movie comedyMovie = (Comedy) comedy;

    Here, you are attempting to cast the comedy object to
    the Comedy subtype. This assumes that the actual object
    returned by getMovie is an instance of the Comedy
    class or a subclass of it. If the object is not of type
    Comedy, a ClassCastException will occur at runtime.
    comedyMovie.watchMovie();

    Finally, you are invoking the watchMovie method on the
    comedyMovie object. This method call will be successful
    if the casting in the previous step is correct, and the
    actual object is an instance of the Comedy class.*/


        //Note:- (below is the simplest way using var)
//var automatically determines the type assigned to it
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        //Lecture - Testing the runtime type using the instanceof operator
        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") { //traditionally checking the runtime type
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) { //using instanceof
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }

        //For chatgpt explanation - refer Onenote
    }
}
