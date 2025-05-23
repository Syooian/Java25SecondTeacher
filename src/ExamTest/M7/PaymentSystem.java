package ExamTest.M7;
import ExamTest.M3.Employee;

public class PaymentSystem {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        Employee E1 = new ExamTest.M4.HourlyEmployee("Archer", "09111111", 1000, 10);
        System.out.println(E1);
        E1.GetTax();
        E1.Earnings();
        E1.GetPaymentAmount();

        System.out.println("=========================================================");
        Employee E2 = new ExamTest.M5.CommissionEmployee("Bill", "09222222", 2000, 0.2,20000);
        System.out.println(E2);
        E2.GetTax();
        E2.Earnings();
        E2.GetPaymentAmount();

        System.out.println("=========================================================");
        Employee E3 = new ExamTest.M5.SalariedEmployee("Charle", "09333333", 3000, 0.3, 30000);
        System.out.println(E3);
        E3.GetTax();
        E3.Earnings();
        E3.GetPaymentAmount();

        System.out.println("=========================================================");
        Employee E4 = new ExamTest.M6.BasePlusCommissionEmployee("David", "09444444", 40000, 0.2, 30000);
        System.out.println(E4);
        E4.GetTax();
        E4.Earnings();
        E4.GetPaymentAmount();
    }
}
