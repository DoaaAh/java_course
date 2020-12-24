package chapter11;

public class Farm {
    public static void main(String[] args){
        Animal donald = new Duck();
        donald.eat();

        Duck kaky = new Duck();
        kaky.makeSound();

        Dog max = new Dog();
        max.makeSound();
    }
}
