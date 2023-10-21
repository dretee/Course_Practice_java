package chapter9;

import java.util.Objects;

public class InheritanceApplication {

    public static void main(String[] args) {
        Employee_Capturing("Uyah Anthony", "Boston", 27, "yy2157T", 20, 67);
        Area_calculation("rectangle", 7, 8);
        Area_calculation("square", 7, 8);


    }


    public static void Employee_Capturing(String Name, String Address, int Age, String ID, int hours, int hourly_pay ){
        Employee details = new Employee();
        details.setName(Name);
        details.setAddress(Address);
        details.setAge(Age);
        details.setEmployee_ID(ID);
        details.setEmployee_total_hours(hours);
        details.setEmployee_pay(hourly_pay);
        System.out.println(details.getName()+ " with ID "+ details.getEmployee_ID()+ " worked for "+
                details.getEmployee_total_hours()+" and his gross pay for the month is $"+ details.totalPay());
    }
    public static void Area_calculation(String shape, int lenght, int width){
        if (Objects.equals(shape, "rectangle")) {
            Rectangle attributes = new Rectangle();
            attributes.setLength(lenght);
            attributes.setWidth(width);
            System.out.println("The area of the " + shape+ " is " + attributes.calculateArea());
        }
        else if (Objects.equals(shape,"square")) {
            Square properties = new Square();
            properties.setLength(lenght);
            properties.setWidth(width);
            System.out.println("The area of the " + shape+ " is "+ properties.calculateArea());
        }
        else{System.out.println("We can only calculate for the area of a square and a rectangle. The "+ shape+ " can't be calculated.");}



    }

}
