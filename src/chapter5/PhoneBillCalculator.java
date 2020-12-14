package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double minuteCharge = .25;
    static double taxPercentage = .15;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg)
    {
        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();
        scanner.close();
        double overageMinutesFees = calculateOverageMinutesFees(overageMinutes);
        double taxAmount = calculateTax(planFee, overageMinutesFees);
        printBillStatement(planFee, overageMinutesFees, taxAmount);
    }
    public static double getPlanFee()
    {
        System.out.println("Enter base cost of the plan: ");
        double planFee = scanner.nextDouble();
        return planFee;
    }
    public static int getOverageMinutes()
    {
        System.out.println("Enter overage minutes: ");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }
    public static double calculateOverageMinutesFees(int overageMinutes)
    {
        double overageMinutesFees = overageMinutes * minuteCharge;
        return overageMinutesFees;
    }
    public static double calculateTax(double planFee, double overageMinutesFees)
    {
        double subtotal = planFee + overageMinutesFees;
        double taxAmount = subtotal * taxPercentage;
        return taxAmount;
    }
    public static void printBillStatement(double planFee, double overageMinutesFees, double taxAmount)
    {
        double totalAmount = planFee + overageMinutesFees + taxAmount;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageMinutesFees);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Total: $" + totalAmount);


    }
}
