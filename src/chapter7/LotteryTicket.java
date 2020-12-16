package chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER= 69;
    public static void main(String[] arg){
        int [] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i = 0 ; i<LENGTH; i++){
            //bound will generate number between 0 and 68 we added 1 as we need to generate between 1 and 69;
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber));
            ticket[i] =randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param randomNumber Value to search for
     * @return True if found, false if not.
     */
    public static boolean search(int[] array, int randomNumber){
        /*
        This called enhanced loop.
        it iterates through 'array' and
        each time assigns the current element to 'value'.
         */
        for(int value: array){
            if(value == randomNumber){
                return true;
            }
        }
            return false;
    }
    public static boolean binarySearch(int [] array, int randomNumber){
        //First sort array
        Arrays.sort(array);
        /*
        user predefined binarysearch and because
        it returns index if =>0
        if number is found we need to save this return
         */
      int index = Arrays.binarySearch(array, randomNumber);
        return index >= 0;
    }
    public static void printTicket(int[] ticket){
        for (int i = 0; i<LENGTH; i++){
            System.out.print(ticket[i] + " ");
        }
    }
}
