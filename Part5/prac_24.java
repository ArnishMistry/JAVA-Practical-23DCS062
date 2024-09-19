package Part5;
import java.util.*;

public class prac_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        
        try {
            System.out.println("Enter the first integer:");
            int x = sc.nextInt();

            System.out.println("Enter the second integer:");
            int y = sc.nextInt();

            ans = x/y;
        } 
        catch(InputMismatchException e) {
            System.out.println("Error: Enter valid integers.");
        } 
        catch(ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            sc.close();
        }
        System.out.println("The result is:"+ans);
    }
}