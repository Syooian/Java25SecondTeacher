package Exam.M4;

import Exam.M3.Employee;

public class HourlyEmployee extends Employee {

    String Wage;

    public void SetWage(String Wage) {
        this.Wage = Wage;
    }

    public String GetWage() {
        return Wage;
    }

    int Hours;

    public void SetHours(int Hours) {
        this.Hours = Hours;
    }

    public int GetHours() {
        return Hours;
    }

    public HourlyEmployee(String Name, String Mobile, String Wage, int Hours) {
        super(Name, Mobile);
        this.Wage = Wage;
        this.Hours = Hours;
    }
}
