import java.util.Scanner;

public class prac9 {
    
    public static void main(String[] args) {
        
          Scanner s1= new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str= s1.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            System.out.print(ch+""+ch); // excluding the empty "" results in addition of asci values
        }
    }


}

