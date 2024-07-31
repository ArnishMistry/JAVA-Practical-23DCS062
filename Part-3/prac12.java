import java.util.Scanner;

class Pound{

    double convert(double i){

        return(100*i);
    }
}

public class prac12 {
    
    public static void main(String[] args) {
        
        double price;

        Scanner s= new Scanner(System.in);
        System.out.print("\nEnter the amout in pound: ");
        price=s.nextDouble();

        Pound obj= new Pound();
        double rupees= obj.convert(price);
        System.out.println("Your amount in rupees: " + rupees);

    }
    
}
