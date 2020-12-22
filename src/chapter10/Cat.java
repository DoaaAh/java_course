package chapter10;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
    public void scratch(){
        System.out.println("I'm a cat, i scratch things.");
    }
}
