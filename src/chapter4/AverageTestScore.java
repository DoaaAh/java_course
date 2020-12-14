package chapter4;

import java.util.Scanner;

public class AverageTestScore {
    public static void main(String[] arg){
        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i< numberOfStudents; i++)
        {
            double total = 0;
            for (int x =0; x<numberOfTests; x++)
            {
                System.out.println("Enter the score for the test #" +(x+1));
                double score = scanner.nextDouble();
                total+=score;
            }
            double average = total/numberOfTests;
            System.out.println("The score average for student #"+ (i+1)+ " is " +average);
        }
        scanner.close();
    }
}
