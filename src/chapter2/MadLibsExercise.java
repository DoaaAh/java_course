package chapter2;

import java.util.Scanner;

public class MadLibsExercise {
    public static void main (String[] arg)
    {
        System.out.println("Enter your favorite season of the year.");
        Scanner scanner = new Scanner(System.in);
        String seasonName = scanner.next();
        System.out.println("Enter a whole number.");
        int wholeNumber = scanner.nextInt();
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();
        scanner.close();
        System.out.println("On a " +adjective+ " " + seasonName+" day, i drink a minimum of " + wholeNumber+ " cups of coffee");
    }
}
