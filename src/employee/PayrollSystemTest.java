package payRollSystem;

import employee.*;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John ", "Mallam ", "1 ", 400000);
        System.out.println(salariedEmployee);
        System.out.println();

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Kenneth ", "Odogwu ", "2 ");
        System.out.println(hourlyEmployee);
        System.out.println();

        CommissionEmployee commissionEmployee = new CommissionEmployee("Mike ", "Adejoh", "3", 100000, .04);
        System.out.println(commissionEmployee);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Ibrahim ", "Atodo ", "4", 250000, .04);
        System.out.println(basePlusCommissionEmployee);


        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphic:%n%n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);


            if (currentEmployee instanceof BasePlusCommissionEmployee employee) {
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }

            System.out.printf("Earned $%,.2f%n%n", currentEmployee.earnings());

        }

    }
}




