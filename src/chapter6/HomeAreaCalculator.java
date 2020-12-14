package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] arg){
        /**************
         *RECTANGLE1
         *************/
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double room1Area = room1.calculateArea();

        /*************
         * RECTANGLE2
         *************/
        Rectangle room2 = new Rectangle(30,75);
        double room2Area = room2.calculateArea();

        double totalArea = room1Area + room2Area;
        System.out.println("Area of both rooms: " +totalArea);
    }
}
