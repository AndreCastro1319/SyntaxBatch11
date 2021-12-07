package classReview2;

class Animal{
    public void eat(){
        System.out.println("All animals eat");
    }
}
public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
    public void sleep(){
        System.out.println("Dog sleeps");
    }
}
class Puppy extends Dog{
    @Override
    public void bark() {
        System.out.println("puppy barks");
    }
    public void drinkMilk(){
        System.out.println("puppy drinks milk");
    }
    public void eat(){
        System.out.println("puppy eats");
    }
}
