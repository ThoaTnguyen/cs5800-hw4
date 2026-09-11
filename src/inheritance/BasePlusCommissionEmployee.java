package inheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSal;

    public BasePlusCommissionEmployee(String fn, String ln, String ssn,
                                      double commRt, double gSales, double baseSal) {
        super(fn, ln, ssn, commRt, gSales);
        this.baseSal = baseSal;
    }

    public double getBaseSalary() {
        return baseSal;
    }

    public void setBaseSalary(double baseSal) {
        this.baseSal = baseSal;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", base salary: $%,.2f", baseSal);
    }
}
