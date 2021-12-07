package Class26HW.part2Task1;

public abstract class Insurance {
    //Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    // Create 3 subclasses Car, Pet, Health.
    // Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    // Create 3 objects of the sub classes and store them in ArrayList.
    // Using for loop/advanced for loop/ iterator access all methods of the class.

    String insuranceName;

   abstract void getQuote();

   abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel="BMW";

   // Car(String carModel){
       /// this.carModel=carModel;
   // }

    @Override
    void getQuote() {
        System.out.println(carModel+" get quote for car insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println(carModel+" cancel car insurance");
    }
}
class Pet extends Insurance{
    String petType="Bulldog";
   // Pet(String petType){
      //  this.petType=petType;
   // }

    @Override
    void getQuote() {
        System.out.println(petType+" quote for pet insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println(petType+" cancel pet insurance");
    }
}
class Health extends Insurance{
    @Override
    void getQuote() {
        System.out.println("get quote for health insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancel health insurance");
    }
}
