public class BasePlusCommissionEmployee  extends  CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    @Override
    public void setBaseSalary(double baseSalary) {
        throw new IllegalArgumentException("Base salary must be >= 0.0");
    }
    this.baseSalary = bas
}
