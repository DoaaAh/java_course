package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main (String[] arg){
        System.out.println("Enter your grade.");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;
        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "ypu need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error! invalid grade";
                break;
        }
        System.out.println(message);
    }
}
