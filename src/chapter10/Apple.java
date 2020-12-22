package chapter10;

public class Apple extends Fruit{
    public Apple(){
        setCalories(20);
    }
    public void removeSeeds(){
        System.out.println("Seeds are removed.");
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made.");
    }

}
