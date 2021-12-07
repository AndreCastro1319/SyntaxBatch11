package Class23.Abstraction;

public abstract class Phone {
        void makePhoneCalls(){
            System.out.println("Making a call");
        }
        void sendText(){
            System.out.println("Sending text");
        }
        abstract void displayPictures();
        abstract void unlockPhone();

        }

    class Iphone extends Phone{
        @Override
        void displayPictures() {
            System.out.println("Iphone uses photos app to display the pictures");
        }
        void unlockPhone(){
            System.out.println("Use FacId to unlock the phone");
        }
    }
class Samsung extends Phone{
    void displayPictures(){
        System.out.println("Use gallery app to view pictures");
    }
    void unlockPhone(){
        System.out.println("Use fingerprint to unlock phone");
    }
}