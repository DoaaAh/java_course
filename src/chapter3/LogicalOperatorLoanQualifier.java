package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main (String[] arg){
        int requiredSalary = 30000;
        int requiredYears = 2;
        System.out.println("Enter your salary.");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();
        scanner.close();
        if(salary >= requiredSalary && years >= requiredYears){
                System.out.println("Congrats! you're qualified for the loan");
            }

        else {
            System.out.println("Sorry you aren't qualified for the loan");
        }
    }
}
