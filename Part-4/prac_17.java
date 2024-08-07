import java.util.*;

public class prac_17 {
    
}

class Parent{
    public int a=10;
    
    public void display()
    {
        System.out.println("This is parent class " + a);
    }
}

class Child extends Parent{
    public int a=10;
    
    public void display()
    {
        System.out.println("This is child class " + a);
    }
}

class main{
    public static void main(String[] args) {
        Parent o1=new Parent();
        Child o2=new Child();
        o1.display();
        o2.display();
    }
}