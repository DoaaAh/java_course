package chapter10;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Haw Haw");
    }
    public void fetch(){
        System.out.println("Fetch is fun!");
    }
}
