import java.util.*;

public class prac8 {
    
    public static void main(String[] args) {
        
        int[] arr={1,2,9,6,7,3};
        array_occurance(arr);

    }

    public static void array_occurance(int arr[]){

        int count=0;
        for(int i=0; i<arr.length;i++)
        {
            if (arr[i]==9)
            {
                count++;
            }
        }
        System.out.println("Numbe rof times '9' has occured: " + count);
    }
}
