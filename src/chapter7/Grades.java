package chapter7;

import java.util.Scanner;

public class Grades {
    public static int[] grades;
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.println("How many grades would you like to enter?");
        grades = new int [scanner.nextInt()];
        scanner.close();
        getGrades();
        System.out.println("Average grades is: " +String.format("%.2f", calculateAverage()));
        System.out.println("The Highest grade is " + getHighest());
        System.out.println("The lowest grade is " + getLowest());

    }
    public static int [] getGrades() {
        for (int i = 0; i<grades.length; i++){
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
        return grades;
    }
    public static int sumGrades() {
        int sum = 0;
        for (int grade: grades){
            sum+=grade;
        }
        return sum;
    }
    public static double calculateAverage(){
        return sumGrades()/grades.length;
    }
    public static int getHighest(){
        int highest = grades[0];
        for (int grade: grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }
    public static int getLowest(){
        int lowest = grades[0];
        for (int grade: grades){
            if (grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
