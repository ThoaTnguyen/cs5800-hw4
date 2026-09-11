package polymorphism;

public class CargoShip extends Ship {
    private int cargoCap;

    public CargoShip(String nm, String yr, int cargoCap) {
        super(nm, yr);
        this.cargoCap = cargoCap;
    }

    public int getCargoCapacity() {
        return cargoCap;
    }

    public void setCargoCapacity(int cargoCap) {
        this.cargoCap = cargoCap;
    }

    @Override
    public void print() {
        System.out.println("Cargo Ship: " + getName() + ", Cargo Capacity: " + cargoCap + " tons");
    }
}
