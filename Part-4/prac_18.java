import java.util.*;

public class prac_18 {
    
}

class Member{

    public String name;
    public int age;
    public long PhoneNumber;
    public String address;
    public double salary;

    
    public Member(String name, int age, long phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        PhoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void display_salary()
    {
        System.out.print("\n Salary: " + salary);
    }

}

class Employee extends Member{
    
    public String specialization;
    public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    
}

class Manager extends Member{

    public String department;
    public Manager(String name, int age, long phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

}

class Test{

    public static void main(String[] args) {
        Employee obj1=new Employee("Jenil",19,937613169,"Mj-Road bhagyalaxmi soc",98000,"digital marketing");
        Manager obj2=new Manager("Preet",19,931323162,"Mj-Road Ganesh soc",99000,"Head office");
    
        System.out.print("Employee\nName: " + obj1.name);
        System.out.print("\n age: " + obj1.age);
        System.out.print("\n Phone number: " + obj1.PhoneNumber);
        obj1.display_salary();
        System.out.print("\n Specialization: " + obj1.specialization);

        System.out.println("\n");

        System.out.print("Manager\nName: " + obj2.name);
        System.out.print("\n age: " + obj2.age);
        System.out.print("\n Phone number: " + obj2.PhoneNumber);
        obj2.display_salary();
        System.out.print("\n Specialization: " + obj2.department);
    }
  
    
}