import java.util.*;
public class prac14 {
    
}
 class Date{
    private int month;
    private int day;
    private int year;
 
    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getter and Setter for month
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // Getter and Setter for day
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Getter and Setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display the date
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

 class DateTest{
    public static void main(String[] args) {
        // Create a Date object
        Date date1 = new Date(7, 14, 2024);

        // Display the date
        System.out.print("The date is: ");
        date1.displayDate();

        // Modify the date
        date1.setMonth(12);
        date1.setDay(25);
        date1.setYear(2023);

        // Display the modified date
        System.out.print("The modified date is: ");
        date1.displayDate();
    }
}
