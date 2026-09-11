package inheritance;

public class HourlyEmployee extends Employee {
    private double wg;
    private double hrs;

    public HourlyEmployee(String fn, String ln, String ssn, double wg, double hrs) {
        super(fn, ln, ssn);
        this.wg = wg;
        this.hrs = hrs;
    }

    public double getWage() {
        return wg;
    }

    public void setWage(double wg) {
        this.wg = wg;
    }

    public double getHoursWorked() {
        return hrs;
    }

    public void setHoursWorked(double hrs) {
        this.hrs = hrs;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", wage: $%.2f, hours worked: %.0f", wg, hrs);
    }
}
