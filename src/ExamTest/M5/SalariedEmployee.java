package ExamTest.M5;

import ExamTest.M3.Employee;

public class SalariedEmployee extends Employee {
    int GrossSales;
    double CommissionRate;
    int BaseSalary;

    public SalariedEmployee(String Name, String Mobile, int GrossSales, double CommissionRate, int BaseSalary) {
        super(Name, Mobile);
        SetGrossSales(GrossSales);
        SetCommissionRate(CommissionRate);
        SetBaseSalary(BaseSalary);
    }

    public int GetGrossSales() {
        return GrossSales;
    }

    public void SetGrossSales(int GrossSales) {
        this.GrossSales = GrossSales;
    }

    public double GetCommissionRate() {
        return CommissionRate;
    }

    public void SetCommissionRate(double CommissionRate) {
        this.CommissionRate = CommissionRate;
    }

    public int GetBaseSalary() {
        return BaseSalary;
    }

    public void SetBaseSalary(int BaseSalary) {
        this.BaseSalary = BaseSalary;
    }

    @Override
    public String toString() {
        return "Salaried " +
                "Name : " + this.GetName() + ", " + "Mobile: " + this.GetMobile();
    }

    @Override
    public void GetTax() {
        System.out.println("Tax : " + (GetGrossSales() * GetCommissionRate() + GetBaseSalary()) * 0.05);
    }

    @Override
    public void GetPaymentAmount() {
        double Earnings = GetGrossSales() * GetCommissionRate() + GetBaseSalary();
        double Tax = (GetGrossSales() * GetCommissionRate() + GetBaseSalary()) * 0.05;
        double PaymentAmount = Earnings - Tax;
        System.out.println("取得員工扣稅所得 : " + PaymentAmount);
    }

    @Override
    public void Earnings() {
       double Earnings =GetGrossSales() * GetCommissionRate() + GetBaseSalary();
       System.out.println("取得員工未扣稅所得 : " + Earnings);
    }
}
