package inheritance;

public class Employee {
    private String fn;
    private String ln;
    private String ssn;

    public Employee(String fn, String ln, String ssn) {
        this.fn = fn;
        this.ln = ln;
        this.ssn = ssn;
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

    public String getSocialSecurityNumber() {
        return ssn;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return fn + " " + ln + " (SSN: " + ssn + ")";
    }
}
