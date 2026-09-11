package polymorphism;

public class PolymorphismDriver {
    public static void main(String[] args) {
        System.out.println("\nPOLYMORPHISM\n");

        Ship[] shps = new Ship[3];
        shps[0] = new Ship("Generic Vessel", "1998");
        shps[1] = new CruiseShip("Ocean Explorer", "2015", 3500);
        shps[2] = new CargoShip("Atlantic Carrier", "2010", 85000);

        for (Ship s : shps) {
            s.print();
        }
    }
}
