package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public PhoneBill() {
        id =0;
        baseCost = 80.75;
        allottedMinutes = 750;
        usedMinutes = 750;
    }
    public PhoneBill(int id){
        this.id = id;
    }
    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }
    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes = usedMinutes;
    }
    public double calculateOverageMinutes() {
        if (usedMinutes <= allottedMinutes){
            return 0;
        }
        double minuteCharge = .25;
        double overageMinutes = usedMinutes - allottedMinutes;
        return overageMinutes * minuteCharge;
    }
    public double calculateTax()
    {
        double taxPercentage = .15;
        return taxPercentage * (baseCost + calculateOverageMinutes());
    }
    public double calculateTotalBill()
    {
        return baseCost + calculateOverageMinutes()+calculateTax();
    }
    public void printBillStatement()
    {
        System.out.println("Phone Bill Statement");
        System.out.println("Bill ID: " + id);
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + String.format("%.2f", calculateOverageMinutes()));
        System.out.println("Tax: $" + String.format("%.2f",calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotalBill()));


    }

}
