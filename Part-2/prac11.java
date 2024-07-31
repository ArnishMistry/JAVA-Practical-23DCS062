import java.util.*;

public class prac11 {
    
    public static void main(String[] args) {
        
        String s="CHARUSAT UNIVERSITY";

        System.out.println("Your string length: " + s.length());

        System.out.print("Modified String: ");
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='H')
            {
                ch[i]='J';
            }
          System.out.print(ch[i]);
        }

        System.out.print("\nYour string in Lower Case: ");
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]>'A' && ch[i]<'Z')
            {
                ch[i]+=32;
            }
            System.out.print(ch[i]);
        }


    }
}
