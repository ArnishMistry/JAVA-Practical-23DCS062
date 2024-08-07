import java.util.Scanner;

interface Shape {
    public String shapeName = "";
    public void setColor(String color);
    public String getColor();
    public void display();
}

class Circle implements Shape {
    protected String shapeName = "Circle";
    protected double radius;
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void display() {
        System.out.println("NAME:" + getShapeName());
        System.out.println("COLOR:" + getColor());
        System.out.println("RADIUS:" + getRadius());
    }
}

class Rectangle implements Shape {
    protected String shapeName = "Rectangle";
    protected double length;
    protected double breadth;
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void display() {
        System.out.println("NAME:" + getShapeName());
        System.out.println("COLOR:" + getColor());
        System.out.println("LENGTH:" + getLength());
        System.out.println("BREADTH: " + getBreadth());
    }
}

class sign {
    Scanner in = new Scanner(System.in);
    private String t;
 
    public void print() {
       System.out.println("ENTER SHAPE [1. RACTANGLE 2. CIRCLE] : ");
       int n = in.nextInt();
       Rectangle r = new Rectangle();
       Circle c = new Circle();
 
       if (n == 1) {
          System.out.println("ENTER COLOR : ");
          r.setColor(in.next());
          System.out.println("ENTER HEIGHT : ");
          r.setLength(in.nextInt());
          System.out.println("ENTER WIDTH : ");
          r.setBreadth(in.nextInt());
 
       } else {
          System.out.println("ENTER COLOR : ");
          c.setColor(in.next());
          System.out.println("ENTER RADIUS : ");
          c.setRadius(in.nextInt());
 
       }
       System.out.println("ENTER TEXT : ");
       in.nextLine();
       t = in.nextLine();
 
       if (n == 1) {
          System.out.println("SIGN DETAIL :- ");
          r.display();
          System.out.println(t);
       } else {
          System.out.println("SIGN DETAIL :- ");
          c.display();
          System.out.println(t);
       }
       in.close();
    }
 }

 public class prac_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        sign s = new sign();
        s.print();
    }
 }