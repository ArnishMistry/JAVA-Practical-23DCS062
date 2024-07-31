import java.util.*;

public class prac6 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int num,temp,ref1=0,ref2=1;
        long sum=0;
        System.out.print("Enter upto which you want the fibonacci: ");
        num= s.nextInt();
        System.out.print("0");
        for(int i=0;i<num;i++)
        {
            temp= ref1 + ref2 ;
            ref1= ref2;
            ref2= temp;

            System.out.print(" "+ temp);

            sum+=temp;
        }

        System.out.println("\nThe sum of your fibonacci numbers is: " + sum);

    }
}

