package chapter9;

public class Rectangle {
    int length ;
    int width;
    int sides = 4;
    public int getlength(){
        return length;
    }
    public int getsides(){
        return sides;

    }
    public int width(){
        return width;
    }

    public void setLength(int L){
        this.length = L;

    }
    public void setSides(int S){
    this.sides = S;
    }
    public void setWidth(int W){
    this. width = W;
    }
    public double calculateArea(){
        return width * length;
    }

    public void Object_classification(String object){
       System.out.println("this is a "+ object);

    }
}

