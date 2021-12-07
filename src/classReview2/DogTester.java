package classReview2;

public class DogTester {
    public static void main(String[] args) {
       Puppy p= new Puppy();
       p.sleep();
       p.bark();
       p.drinkMilk();
        System.out.println("- - - - - - - - - -");

       Dog dog=new Puppy();
       dog.sleep();
       dog.bark();
        System.out.println("- - - - - - - - - - ");

       Animal animal=new Puppy();
       animal.eat();
        System.out.println("- - - - - - - - - - - ");

       Dog [] dogs={new Puppy()};
       for(Dog dog1:dogs){
           if(dog1 instanceof Puppy ){
               ((Puppy)dog1).drinkMilk();
           }
       }

    }
}
