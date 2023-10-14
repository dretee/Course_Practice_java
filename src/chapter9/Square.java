package chapter9;

public class Square extends Rectangle{
    @Override
    public double calculateArea() {
        return length *length;
    }

    public void Object_classification(String object){
        System.out.println(" this is a "+ object);
    }
}
