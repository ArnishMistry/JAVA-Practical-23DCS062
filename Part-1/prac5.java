
import java.util.Scanner;

public class prec5 {

    public static void main(String[] args) {
        float sum = 0;
        float price[] = {100, 100, 100, 100, 100};
        int choice,qun;
        Scanner s = new Scanner(System.in);

        System.out.println("1.Motor");
        System.out.println("2.Fan");
        System.out.println("3.Tube");
        System.out.println("4.Wires");
        System.out.println("5.Other");
        System.out.println("Enter Item You Want to Add : ");
        choice = s.nextInt();

        System.out.println("Total Quntity : ");
        qun=s.nextInt();

            switch (choice) {
                case 1:
            
                    sum += price[0] * 0.08 * qun;

                    break;
                case 2:

                    sum += price[1] * 0.12 * qun;

                    break;
                    case 3:

                    sum += price[2] * 0.05 * qun;
                    break;

                    case 4:
                    
                    sum += price[3] * 0.075 * qun;
                    break;

                    case 5:

                    sum += price[4]*0.03 * qun;
                    break;
            }

            System.out.println("Total = "+ sum);

    }
}
