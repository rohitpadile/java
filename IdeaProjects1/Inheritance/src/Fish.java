public class Fish extends Animal{
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type,"small" /*hardcoded for simplicity*/, weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.println("muscles moving ");
    }
    private void moveBackFin() {
        System.out.println("backfin moving ");
    }

    public void move(String speed) {
        super.move(speed); //this simply means we are @overriding , inheriting!
        moveMuscles();
        if(speed=="fast" ) {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
