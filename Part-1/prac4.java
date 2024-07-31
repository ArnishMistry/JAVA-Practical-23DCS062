import java.util.*;

public class prac4{

    public static void main(String[] args){

        Scanner s= new Scanner(System.in);

        float[] arr= new float [3];
        float sum=0;
        System.out.println("Enter your daily expenses : ");

        for(int i=0;i<3;i++)
        {
           arr[i]= s.nextFloat();
           sum+=arr[i];
        }
        System.out.println("Your total expense: "+ sum);
    }


}