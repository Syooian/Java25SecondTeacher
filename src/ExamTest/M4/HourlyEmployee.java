package ExamTest.M4;

import ExamTest.M3.Employee;

public class HourlyEmployee extends Employee {

    int Wage;

    public void SetWage(int Wage) {
        this.Wage = Wage;
    }

    public int GetWage() {
        return Wage;
    }

    int Hours;

    public void SetHours(int Hours) {
        this.Hours = Hours;
    }

    public int GetHours() {
        return Hours;
    }

    public HourlyEmployee(String Name, String Mobile, int Wage, int Hours) {
        super(Name, Mobile);
        SetWage(Wage);
        SetHours(Hours);
    }

    @Override
    public String toString(){
        return 
            "Name : " + GetName() + 
            ", Mobile: " + GetMobile() + 
            ", Wage: " + GetWage() + 
            ", Hours: " + GetHours();
    }

    @Override
    public void GetTax(){
        System.out.println("Tax : " + GetWage() * GetHours() * 0.05);
    }

    @Override
    public void GetPaymentAmount(){
        int Earnings=GetWage()*GetHours();
        double Tax=Earnings*0.05;
        double PaymentAmount=Earnings-Tax;
        System.out.println("取得員工扣稅所得 : " + PaymentAmount);
    }

    @Override
    public void Earnings(){
        System.out.println("取得員工未扣稅所得 : " + GetWage() * GetHours());
    }
}
