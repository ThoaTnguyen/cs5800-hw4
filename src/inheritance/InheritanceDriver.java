package inheritance;

public class InheritanceDriver {
    public static void main(String[] args) {
        System.out.println("\nINHERITANCE\n");

        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.00);
        BasePlusCommissionEmployee renwa = new BasePlusCommissionEmployee(
                "Renwa", "Chanel", "555-55-5555", 0.0, 0.0, 1700.00);
        BasePlusCommissionEmployee mike = new BasePlusCommissionEmployee(
                "Mike", "Davenport", "666-66-6666", 0.0, 0.0, 95000.00);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00);

        Employee[] emps = {joe, stephanie, mary, nicole, renwa, mike, mahnaz};

        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
}
