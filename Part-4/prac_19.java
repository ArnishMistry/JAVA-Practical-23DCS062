import java.util.*;

public class prac_19 {

}

class Rectangle{
    public float length;
    public float breadth;

    Rectangle(){
        length=0;
        breadth=0;
    }

    Rectangle(float l, float b){
        length=l;
        breadth=b;
    }

    public void area(float l, float b)
    {
       System.out.println("Area : " +(length*breadth));
    }

    public void perimeter(float l, float b)
    {
       System.out.println("Perimeter : " +(length+breadth));
    }
}

class Square extends Rectangle{

    Square(float s, float w){
        super(l,b);

    }
}
