import java.util.*;

public class prac15 {
   
}

class Area{

        float length;
        float breadth;

        Area()
        {
            length=0;
            breadth=0;
        }
        Area(float l, float b )
        {
            length=l;
            breadth=b;
        }

        float returnArea(float length,float breadth)
        {
            return (length*breadth);
        }
}

 class Areatest
{
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        float len,bre;
        System.out.print("Enter the length of rectangle: ");
        len=s.nextFloat();
        System.out.print("\nEnter the breadth of rectangle: ");
        bre=s.nextFloat();

        Area a=new Area(len, bre);
        float result= a.returnArea(len, bre);
        System.out.println("\nArea of your rectangle is: "+ result);

    }
}