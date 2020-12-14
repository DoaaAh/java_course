package chapter5;

import java.util.Scanner;

public class Greeting {
    public static void greetingMessage(String name)
    {
        System.out.println("Hello " + name + ", It's nice to meet you.");

    }
    public static void main(String[] arg){
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        greetingMessage(name);

    }
}
