package polymorphism;

public class Ship {
    private String nm;
    private String yr;

    public Ship(String nm, String yr) {
        this.nm = nm;
        this.yr = yr;
    }

    public String getName() {
        return nm;
    }

    public void setName(String nm) {
        this.nm = nm;
    }

    public String getYearBuilt() {
        return yr;
    }

    public void setYearBuilt(String yr) {
        this.yr = yr;
    }

    public void print() {
        System.out.println("Ship: " + nm + ", Year Built: " + yr);
    }
}
