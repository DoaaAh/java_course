package chapter9;

public class InheritanceTester {
    public static void main(String[] arg) {
        Mother mother = new Mother();
        mother.setName("Nadia");
        System.out.println(mother.getName() + " is a " + mother.getGender());
    }

    public static void testOverload() {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("Square");
    }
}
