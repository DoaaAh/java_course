package chapter10;

public class Zoo {
    public static void main(String[] arg){
        Dog cesar = new Dog();
        cesar.fetch();
        cesar.makeSound();
        feed(cesar);

        Animal max = new Dog();
        max.makeSound();
        feed(max);

        max = new Cat();
        max.makeSound();
        ((Cat)max).scratch();
        feed(max);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog)
        {
            System.out.println("Here's your dog food");
        }
        else {
            System.out.println("Here's your cat food");
        }
    }
}
