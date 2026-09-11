package inheritance;

public class SalariedEmployee extends Employee {
    private double wkSal;

    public SalariedEmployee(String fn, String ln, String ssn, double wkSal) {
        super(fn, ln, ssn);
        this.wkSal = wkSal;
    }

    public double getWeeklySalary() {
        return wkSal;
    }

    public void setWeeklySalary(double wkSal) {
        this.wkSal = wkSal;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", weekly salary: $%,.2f", wkSal);
    }
}
