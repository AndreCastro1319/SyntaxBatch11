package Class22HW;

public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.
    String model;

    Computer(String model ) {
        this.model = model;

    }
        void turnOn(){
            System.out.println(model+" Turn on in 8 seconds");
        }
        void turnOff(){
            System.out.println(model+" Turns off in 8 seconds");

    }
}
    class Apple extends Computer{
    Apple(String model){
        super(model);
    }

        @Override
        void turnOn() {
            System.out.println(model+" Turn on in 1 second");
        }

        @Override
        void turnOff() {
            System.out.println(model+" Turn off in 1 second");
        }
        void graphics(){
            System.out.println(model+" Has Graphics of AMD Radeon Pro 5300 with 4GB of GDDR6 memory");
        }
    }
    class Lenovo extends Computer{
    Lenovo(String model){
        super(model);
    }

        @Override
        void turnOn() {
            System.out.println(model+" Turn on in 2 seconds");
        }

        @Override
        void turnOff() {
            System.out.println(model+" Turn off in 2 seconds");
        }
        void display(){
            System.out.println(model+" Has a display of 15.6  LED backlit glossy");
        }
    }
    class HP extends Computer{
    HP(String model){
        super(model);
    }

        @Override
        void turnOn() {
            System.out.println(model+" Turn on in 3 seconds");
        }

        @Override
        void turnOff() {
            System.out.println(model+" Turn off in 3 seconds");
        }
        void connectivity(){
            System.out.println(model+" Wi-Fi standards supported. 802.11 ac.");
        }
    }
    class DELL extends Computer{
    DELL(String model){
        super(model);
    }

        @Override
        void turnOn() {
            System.out.println(model+" Turn on in 4 seconds");
        }

        @Override
        void turnOff() {
            System.out.println(model+" Turn off in 4 seconds");
        }
        void storage(){
            System.out.println( model+ " Has the Storage of Hard disk. 1TB. ...");
        }
    }