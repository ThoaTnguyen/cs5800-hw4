package payable;

public class VendorInvoice implements Payable {
    private String vName;
    private String invNum;
    private double amtDue;

    public VendorInvoice(String vName, String invNum, double amtDue) {
        this.vName = vName;
        this.invNum = invNum;
        setAmountDue(amtDue);
    }

    public String getVendorName() {
        return vName;
    }

    public void setVendorName(String vName) {
        this.vName = vName;
    }

    public String getInvoiceNumber() {
        return invNum;
    }

    public void setInvoiceNumber(String invNum) {
        this.invNum = invNum;
    }

    public double getAmountDue() {
        return amtDue;
    }

    public void setAmountDue(double amtDue) {
        if (amtDue < 0) {
            throw new IllegalArgumentException("Amount due must be non-negative.");
        }
        this.amtDue = amtDue;
    }

    @Override
    public String getPayeeName() {
        return vName;
    }

    @Override
    public double calculatePayment() {
        return amtDue;
    }

    public void print() {
        System.out.printf("Vendor: %s, Invoice: %s - Payment: $%,.2f%n",
                vName, invNum, calculatePayment());
    }
}
