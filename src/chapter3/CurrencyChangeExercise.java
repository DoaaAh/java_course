package chapter3;

import java.util.Scanner;

public class CurrencyChangeExercise {
    public static void main (String[] arg) {
        double half = .5;
        double quarter = .25;
        int EGP = 1;
        System.out.println("How many half do you have?");
        Scanner scanner = new Scanner(System.in);
        int halfs = scanner.nextInt();
        System.out.println("How many quarters do you have?");
        int quarters = scanner.nextInt();
        scanner.close();
        double total = halfs * half + quarters * quarter;
        if (total > EGP) {
            double amountOver = total - EGP;
            System.out.println("sorry, you lose! you were over " + amountOver);
        } else if(total < EGP){
            double amountOver = EGP - total;
            System.out.println("sorry, you lose! you were under " + amountOver);

        }
        else
        {
            System.out.println("Congrats! that's exactly 1 EGP");
        }
    }

    }

