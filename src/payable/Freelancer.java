package payable;

public class Freelancer implements Payable {
    private String fn;
    private String ln;
    private double hrRt;
    private double hrs;

    public Freelancer(String fn, String ln, double hrRt, double hrs) {
        this.fn = fn;
        this.ln = ln;
        setHourlyRate(hrRt);
        setHoursWorked(hrs);
    }

    public String getFirstName() {
        return fn;
    }

    public void setFirstName(String fn) {
        this.fn = fn;
    }

    public String getLastName() {
        return ln;
    }

    public void setLastName(String ln) {
        this.ln = ln;
    }

    public double getHourlyRate() {
        return hrRt;
    }

    public void setHourlyRate(double hrRt) {
        if (hrRt < 0) {
            throw new IllegalArgumentException("Hourly rate must be non-negative.");
        }
        this.hrRt = hrRt;
    }

    public double getHoursWorked() {
        return hrs;
    }

    public void setHoursWorked(double hrs) {
        if (hrs < 0) {
            throw new IllegalArgumentException("Hours worked must be non-negative.");
        }
        this.hrs = hrs;
    }

    @Override
    public String getPayeeName() {
        return fn + " " + ln;
    }

    @Override
    public double calculatePayment() {
        if (hrs <= 40) {
            return hrRt * hrs;
        }
        return (hrRt * 40) + (hrRt * 1.5 * (hrs - 40));
    }

    public void print() {
        System.out.printf("%s - Payment: $%,.2f%n", getPayeeName(), calculatePayment());
    }
}
