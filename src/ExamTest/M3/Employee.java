package ExamTest.M3;

import ExamTest.M1.Earnings;
import ExamTest.M2.iInvoice;
import ExamTest.M2.iPayable;

public class Employee extends Earnings implements iPayable, iInvoice {

    String Name;
    String Mobile;

    public Employee(String Name, String Mobile) {
        SetName(Name);
        SetMobile(Mobile);
    }

    public void SetName(String Name) {
        this.Name = Name;
    }

    public String GetName() {
        return Name;
    }

    public void SetMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String GetMobile() {
        return Mobile;
    }

    @Override
    public void GetTax() {
        
    }

    @Override
    public void GetPaymentAmount() {
        
    }

    @Override
    public String toString() {
        // 返回員工的詳細資訊
        return "";
    }

    @Override
    public void Earnings(){

    }
}
