package chapter6;

public class PhoneBillCalculator {
    public static void main(String[] arg){
        PhoneBill bill = new PhoneBill(707);
        bill.setAllottedMinutes(900);
        bill.setUsedMinutes(1000);
        bill.setBaseCost(90.50);
        bill.printBillStatement();
    }
}
