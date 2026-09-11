package inheritance;

public class CommissionEmployee extends Employee {
    private double commRt;
    private double gSales;

    public CommissionEmployee(String fn, String ln, String ssn, double commRt, double gSales) {
        super(fn, ln, ssn);
        this.commRt = commRt;
        this.gSales = gSales;
    }

    public double getCommissionRate() {
        return commRt;
    }

    public void setCommissionRate(double commRt) {
        this.commRt = commRt;
    }

    public double getGrossSales() {
        return gSales;
    }

    public void setGrossSales(double gSales) {
        this.gSales = gSales;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", commission rate: %.0f%%, gross sales: $%,.2f",
                commRt * 100, gSales);
    }
}
