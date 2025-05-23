package ExamTest.M6;

import ExamTest.M5.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    public BasePlusCommissionEmployee(String Name, String Mobile, int GrossSales, double CommissionRate, int BaseSalary) {
        super(Name, Mobile, GrossSales, CommissionRate * 1.3, BaseSalary);
    }

    @Override
    public String toString() {
        return "BasePlusCommission " +
                "Name : " + GetName() + ", " +
                "Mobile: " + GetMobile();
    }

}
