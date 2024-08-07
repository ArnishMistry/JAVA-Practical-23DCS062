import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for(int i = 1; i<=n; i++) {
            if(n%i == 0) {
                sum +=i;
            }
        }
        return sum;
    }
}
public class prac_22 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int number = scanner.nextInt(); 
        MyCalculator obj = new MyCalculator();
        int sum = obj.divisor_sum(number);
        System.out.println("The sum of the divisors of entered number is: "+ sum);
    }
}
