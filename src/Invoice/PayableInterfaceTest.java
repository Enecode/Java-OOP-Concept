package Payable;

import Invoice.Invoice;
import employee.SalariedEmployee;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payables = new Payable[]{
                new Invoice("1234", "seat", 2, 234.00),
                new Invoice("2345", "tire", 4, 79.95),
                new SalariedEmployee("Mike", "John", "111-111", 800.00),
                new SalariedEmployee("Grace", "Mavelous", "333-333", 900.00),
        };
        System.out.println("Invoices and Employees processed polymorphic:");
        for (Payable currentPayable : payables){
            System.out.println("%n%s %npayment due: $%,.2f%n",
            currentPayable.toString(),
            currentPayable.getPaymentAmount();
        }
    }
}
