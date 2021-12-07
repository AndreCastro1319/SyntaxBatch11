package Class26HW.part2Task2;

public abstract class Card {
    //Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
    // Create 3 subclasses of a Card card.
    // Create 3 objects of different card and store them into LinkedList.
    // Using for loop/advanced for loop/ iterator access all methods of the class.
    String cardType;

    Card(String cardType) {
        this.cardType = cardType;
    }

    abstract void color();

    void limit() {
        System.out.println("limit is 10000");
    }
}
    class Visa extends Card{


        Visa(String cardType) {
            super(cardType);
        }

        @Override
        void color() {
            System.out.println(cardType+" card is red");
        }

        @Override
        void limit() {
            System.out.println(cardType+" limit is $10,000");
        }
    }
    class Amex extends Card{
        Amex(String cardType){
            super(cardType);
        }

        @Override
        void color() {
            System.out.println(cardType+" card is green");
        }

        @Override
        void limit() {
            System.out.println(cardType+" limit is $25,000");
        }
    }
    class Discover extends Card{
        Discover(String cardType){
            super(cardType);
        }

        @Override
        void color() {
            System.out.println(cardType+" is orange");
        }

        @Override
        void limit() {
            System.out.println(cardType+" limit is $35,000");
        }
    }

