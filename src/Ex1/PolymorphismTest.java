package Ex1;


import Ex2.BasePlusCommissionEmployee;
import Ex2.CommissionEmployee;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Bob", "Barker", "222-222-222", 1000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Wallace", "Balanius", "333-32-333", 50000, 0.1, 1000000);
        System.out.printf("%s", commissionEmployee);
        System.out.println();
        System.out.printf("%s", basePlusCommissionEmployee);

        //polymorphism Part
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
        System.out.println();
        System.out.println();
        System.out.printf("%s", commissionEmployee);
    }
}

