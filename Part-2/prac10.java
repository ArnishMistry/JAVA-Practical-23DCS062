import java.util.*;


class STRING{

    void sorted(String s){
        
        char ch[] = s.toCharArray();
        int i,j;
        for( i=0;i<s.length()-1;i++)
        {
            for( j=0;j<s.length()-i-1;j++)
            {
               if(ch[j]>ch[j+1])
               {
                char temp= ch[j];
                ch[j]=ch[j+1];
                ch[j+1]=temp;
               }
            }
        }
        for(i=0;i<s.length();i++)
        {
            System.out.print(ch[i]);
        };
    }

}

public class prac10 {
    public static void main(String[] args) {
        
        String str="JenilCaptain";

        System.out.println("Length of your string: " + str.length());
        System.out.println("Your string in lowercase: " + str.toLowerCase());
        System.out.println("Your string in Uppercase: " + str.toUpperCase());
        System.out.print("Reversing your string : ");
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

        STRING obj= new STRING();
        System.out.println("\nString after sorting: ");
        obj.sorted(str);    
    }
}



