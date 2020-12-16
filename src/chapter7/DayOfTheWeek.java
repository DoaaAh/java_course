package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String [] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Enter the day number");
        int dayNumber = scanner.nextInt();
        scanner.close();
        System.out.println("The corresponding day is " +weekDays[dayNumber-1]);
    }
}
