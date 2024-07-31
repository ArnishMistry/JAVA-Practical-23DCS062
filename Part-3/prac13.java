import java.util.*;
public class prac13 {

}

class employee{

    String firts_name;
    String last_name;
    double salary;
    employee()
    {

    }
    employee(String fs, String ls, double s){
        firts_name= fs;
        last_name= ls;
        salary=check_sal(s);

    }

    double check_sal(double s){
        if(s<0)
        {
            return salary=0.0;
        }
        else
        {
           return salary= s;
        }
    }

    Double raise(double sal){

        return ((sal*10)+sal);
    }
        // setting the values to instances
    String setfirtsname(String fs){
       return firts_name=fs;
    }
    String setlastsname(String fs){
       return last_name=fs;
    }
    Double salary(double sal){
       return salary=check_sal(sal);
    }

        // getting the values of instances
    String get_firstname(){
        return firts_name;
    }
    String get_lastname(){
        return last_name;
    }
    Double sal(){
        return salary;
    }

}

class employeeTest{

    public static void main(String[] args) {

        employee emp1= new employee("Jenil","Captain",2000);
        employee emp2= new employee("Arnish","Mistry",9000);
   
            System.out.println("Employee 1:\n" + emp1.setfirtsname(emp1.firts_name) + " " + emp1.setfirtsname(emp1.last_name));
            System.out.println("Salary: " + emp1.salary(emp1.salary));
            System.out.println("After Raise in salary: " + emp1.raise(emp1.salary));
            System.out.print("\n");
            System.out.println("Employee 2:\n" + emp2.setfirtsname(emp2.firts_name) + " " + emp2.setfirtsname(emp2.last_name));
            System.out.println("Salary: " + emp2.salary(emp2.salary));
            System.out.println("After Raise in salary: " + emp2.raise(emp2.salary));

    }
}
