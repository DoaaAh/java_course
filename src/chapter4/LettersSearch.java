package chapter4;

import java.util.Scanner;

public class LettersSearch {
    public static void main(String[] arg){
        System.out.println("Enter some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        int aCounter = 0;
        boolean charFound = false;
        for (int i =0; i<text.length(); i++)
        {
            char currentChar = text.charAt(i);
            if (currentChar=='A' || currentChar == 'a')
            {
                charFound = true;
                break;
            }
        }
        if (charFound == true){
            System.out.println("This text contains the char 'A'");
        }
        else
        {
            System.out.println("This text doesn't contain the char 'A'");
        }

    }
}
