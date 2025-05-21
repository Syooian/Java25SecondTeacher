package Exam.M3;

import Exam.M1.Earnings;
import Exam.M2.Invoice;
import Exam.M2.Payable;

public class Employee extends Earnings implements Payable, Invoice {

    public Employee(String Name, String Mobile) {
        super(Name, Mobile);
    }

    @Override
    public void SetName(String Name) {
        this.Name = Name;
    }

    @Override
    public String GetName() {
        return Name;
    }

    @Override
    public void SetMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    @Override
    public String GetMobile() {
        return Mobile;
    }

    @Override
    public int GetTax() {
        return 100;
    }

    @Override
    public int GetPaymentAmount() {
        return 999;
    }

    @Override
    public String toString() {
        // 返回員工的詳細資訊
        return "Name : " + GetName() + ", Mobile: " + GetMobile() + ", Tax: " + GetTax();
    }
}
