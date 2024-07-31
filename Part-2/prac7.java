import java.util.*;

public class prac7{
    public static void main(String[] args) {
        
       // String s1="Chochlate";
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str= s1.nextLine();
        String s2= str.substring(0,3);
        front_times(s2, 3);
    }
    public static void front_times(String str, int n){
            for(int i=0;i<n;i++)
            {
                System.out.println(str);
            }
    }
}
