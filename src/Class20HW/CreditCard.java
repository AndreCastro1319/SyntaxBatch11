package Class20HW;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    double balance;
    double interest;

    void calculateInterest(double balance,double interest){
        System.out.println(balance*interest+" is the interest for your Creditcard  ");

    }
    static class Visa extends CreditCard{

    }
    static class AX extends CreditCard{
        @Override
        void calculateInterest(double balance, double interest) {
            System.out.println(balance*interest+" is the interest for your AX card");

        }

        }

    public static void main(String[] args) {
    CreditCard creditCard=new CreditCard();
    creditCard.calculateInterest(5000,0.002);
    Visa creditCard1=new Visa();
    creditCard1.calculateInterest(1000,0.002);
    AX creditCard2=new AX();
    creditCard2.calculateInterest(3000,0.003);




    }
}
