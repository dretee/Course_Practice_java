package chapter9;

/**
 * this class defines a person and its attributes, age, name, job, address and gender
 */
public class Person {
    // initializing the fields

    String name ;
    int age;
    String address;
    String gender;

//    public Person(String name, int age, String address, String gender) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.gender = gender;


// getter and setter
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getage(){
        return age;
    }
    public String getgender(){
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
