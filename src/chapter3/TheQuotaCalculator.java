package chapter3;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class TheQuotaCalculator {
    public static void main (String[] arg){
        int quota = 10;
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if(sales >= quota){
            System.out.println("Congrats! you've met your quota");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("Sorry, you haven't met your quota, you were " + salesShort+ " sales short.");
        }
    }
}
