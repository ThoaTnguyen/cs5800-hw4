package aggregation;

public class Instructor {
    private String fn;
    private String ln;
    private String offNum;

    public Instructor(String fn, String ln, String offNum) {
        this.fn = fn;
        this.ln = ln;
        this.offNum = offNum;
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

    public String getOfficeNumber() {
        return offNum;
    }

    public void setOfficeNumber(String offNum) {
        this.offNum = offNum;
    }
}
