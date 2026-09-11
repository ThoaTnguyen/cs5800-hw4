package payable;

import java.util.ArrayList;

public class PayableDriver {
    public static void main(String[] args) {
        System.out.println("\nINTERFACE\n");

        ArrayList<Payable> ps = new ArrayList<>();

        ps.add(new Freelancer("Alex", "Rivera", 45.00, 38));
        ps.add(new Freelancer("Jordan", "Lee", 55.00, 47));
        ps.add(new VendorInvoice("Office Depot", "INV-1001", 325.50));
        ps.add(new VendorInvoice("Cloud Services Inc.", "INV-2048", 1200.00));

        double total = 0.0;

        for (Payable p : ps) {
            if (p instanceof Freelancer fl) {
                fl.print();
            } else if (p instanceof VendorInvoice inv) {
                inv.print();
            }
            total += p.calculatePayment();
        }

        System.out.printf("%nTotal payout for the period: $%,.2f%n", total);
    }
}
