package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg){
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(salary, creditScore);
        notifyTheUser(qualified);

    }
    public static double getSalary()
    {
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore()
    {
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(double salary, int creditScore)
    {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }
    public static void notifyTheUser(boolean qualified) {
        if (qualified)
        {
            System.out.println("Congrates! You're qualified");
        }
        else
        {
            System.out.println("Sorry! You aren't qualified");
        }
    }
}
