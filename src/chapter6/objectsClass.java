package chapter6;
/*
In this class I will be exploiting the uses of objects to allow for a more structured code.
the example will handle the collection of the data of an employee and its output given.
 */
public class objectsClass {
    //These are the fields for the structure. the name, id and the salary of the employee is initialized.
    String name;
    int employeeid;
    double salary;

    // First method for the referencing process for the object
    void inputDetails(int id, String name, double pay){
         employeeid = id;
        this.name =name;
        salary = pay;
    }
    // The next method will aid the displaying of the details
    void display(){
        System.out.println(name +" "+ employeeid +" "+ salary);
    }

    public static void main(String[] args) {
        objectsClass obj = new objectsClass(),obj1 = new objectsClass();
        obj.inputDetails(123,"uyah", 2000.34);
        obj1.inputDetails(15523,"anthony", 20);
        obj.display();
        obj1.display();
    }

}
