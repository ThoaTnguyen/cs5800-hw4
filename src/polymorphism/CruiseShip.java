package polymorphism;

public class CruiseShip extends Ship {
    private int maxPass;

    public CruiseShip(String nm, String yr, int maxPass) {
        super(nm, yr);
        this.maxPass = maxPass;
    }

    public int getMaxPassengers() {
        return maxPass;
    }

    public void setMaxPassengers(int maxPass) {
        this.maxPass = maxPass;
    }

    @Override
    public void print() {
        System.out.println("Cruise Ship: " + getName() + ", Max Passengers: " + maxPass);
    }
}
