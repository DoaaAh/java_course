package chapter7;

import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER= 69;
    public static void main(String[] arg){
        int [] ticket = generateNumbers();
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i = 0 ; i<LENGTH; i++){
            //bound will generate number between 0 and 68 we added 1 as we need to generate between 1 and 69;
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return ticket;
    }
    public static void printTicket(int[] ticket){
        for (int i = 0; i<LENGTH; i++){
            System.out.print(ticket[i] + " ");
        }
    }
}
