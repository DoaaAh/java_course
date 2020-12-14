package chapter4;

import java.util.Scanner;

public class SumNumbers {
    public static void main (String[] arg){
        boolean again;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the first number.");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the second number.");
            double secondNumber = scanner.nextDouble();
            double sum = firstNumber + secondNumber;
            System.out.println("The sum of those two numbers is: " + sum);
            System.out.println("Would you like to start over? True or False");
            again = scanner.nextBoolean();

        } while (again);
        scanner.close();
    }
}
