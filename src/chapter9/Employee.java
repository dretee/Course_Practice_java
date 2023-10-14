package chapter9;

public class Employee extends Person{

   String employee_ID;
   double employee_pay;
   double employee_total_hours;
    double total_pay;

    public String getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(String employee_ID) {

        if (employee_ID.length()>8 || employee_ID.length()<3){
            throw new IllegalArgumentException();

        } else{ this.employee_ID = employee_ID;}

    }

    public double getEmployee_pay() {
        return employee_pay;
    }

    public void setEmployee_pay(double employee_pay) {
        this.employee_pay = employee_pay;
    }

    public double getEmployee_total_hours() {
        return employee_total_hours;
    }

    public void setEmployee_total_hours(double total_hours) {
        this.employee_total_hours = total_hours;

    }
    public double totalPay(){
        double hours = this.employee_total_hours;
        double pay = this.employee_pay;
        return hours * pay;
    }
}
