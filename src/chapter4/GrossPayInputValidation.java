package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main (String[] arg){
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursworked = scanner.nextDouble();

        while (hoursworked > maxHours || hoursworked  < 1){
            System.out.println("invalid entry. Your hours must be between 1 and 40. Try again");
            hoursworked = scanner.nextDouble();
        }
        scanner.close();
        double gross = rate * hoursworked;
        System.out.println("Your gross salary is $" + gross);
    }
}
