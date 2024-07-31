import java.util.*;
public class prac16 {
}

class Complex{
    
    float real;
    float img;
    
    Complex(){}

    Complex(float r, float i)
    {
        real=r;
        img=i;
    }

    Complex sum(Complex c){
        Complex temp = new Complex();
        temp.real= real+c.real;
        temp.img= img+img;
        return temp;
    }

    Complex difference(Complex c){
        Complex temp = new Complex();
        temp.real= real-c.real;
        temp.img= img-img;
        return temp;
    }

    Complex product(Complex c){
        // Complex temp = new Complex();
        // temp.real= real*c.real;
        // temp.img= img*img;
        return new Complex(real*c.real,img*c.img);
    }

}

class ComplexTest{
public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    float r1,i1;
    System.out.print("Enter the real and imaginary part of Complex number 1: ");
    r1= s.nextFloat();
    i1= s.nextFloat();
    Complex c1= new Complex(r1,i1);
    float r2,i2;
    System.out.print("Enter the real and imaginary part of Complex number 2: ");
    r2= s.nextFloat();
    i2= s.nextFloat();
    Complex c2= new Complex(r2,i2);
    
    Complex sumResult = c1.sum(c2);
    System.out.println("Sum: " + sumResult.real + " + " + sumResult.img + "i");

    Complex diffResult = c1.difference(c2);
    System.out.println("Difference: " + diffResult.real + " + " + diffResult.img + "i");

    Complex prodResult = c1.product(c2);
    System.out.println("Product: " + prodResult.real + " + " + prodResult.img + "i");


}

}