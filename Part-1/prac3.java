import java.util.*;

public class prac3{

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int distance,choice;
      //  int[] time = new int[3];
        float min,hours,sec,total_sec,total_hours,vel_mps,vel_kmph,vel_mph;

        System.out.print("Enter the distance travelled in meters: ");
        distance= s.nextInt();
        System.out.println("Enter the time taken:");
        System.out.print("In hours:");
        hours=s.nextInt();
        System.out.print("In minutes:");
        min=s.nextInt();
        System.out.print("In seconds:");
        sec=s.nextInt();

        total_sec= ((min*60) + (hours*60*60));

        total_hours=((min/60)+((sec/60)/60));

         do{
            System.out.println("Enter 1 if you ant speed in meter/sec \nEnter 2 if you want speed in kilometer/ hour \nEnter 3 if you want speed in miles/hour");
            System.out.print("Your choice:");
            choice=s.nextInt();
        switch (choice) {
            case 1:
            vel_mps= (distance/total_sec);
            System.out.println("Your velocity: " + vel_mps +" m/s.");
                
                break;

                case 2:
                vel_kmph= ((distance/1000)/(total_hours));
                System.out.println("Your velocity: " + vel_kmph +" km/h.");
                break;

                case 3:
                vel_mph= ((distance/1609)/(total_hours));
                System.out.println("Your velocity: " + vel_mph +" miles/h.");
                break;
        
            default:
            System.out.println("Enter a Valid Choice !");
                break;
        }
    }while(1<choice && choice>3);

    System.out.println("JENIL CAPTAIN \n23DCS013");
    }
    
}