package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] arg){
        System.out.println("Hom many items you would like to scan?");
        Scanner scanner = new Scanner(System.in);
        int itemsNumber = scanner.nextInt();
        double total = 0;
        for (int i = 0; i<itemsNumber; i++)
        {
            System.out.println("Enter the cost of the item");
            double cost = scanner.nextDouble();
            total+=cost;
        }
        System.out.println("The total cost is $ " + total);
        scanner.close();

    }
}
