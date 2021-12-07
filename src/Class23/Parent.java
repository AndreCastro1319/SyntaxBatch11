package Class23;

public class Parent {
    private final String NAME="Fatma";
    protected final int AGE=20;
    public final double WEIGHT_OF_AVG_HUMAN=30;
    final double HEIGHT=5.4;
    static final int NO_OF_LEGS=2;
     String hairColor="black";

    private void printName(){
        System.out.println(NAME);
    }
    void  printHairColor(){
        System.out.println(hairColor);
    }
    final void printAge(){
        System.out.println(AGE);
    }
    protected final void printHeight(){
        System.out.println(HEIGHT);
    }
    public final void printWeight(){
        System.out.println(WEIGHT_OF_AVG_HUMAN);
    }
    public static void printNoOfLegs(){
       //System.out.println(WEIGHT_OF_AVG_HUMAN); NOT ALLOWED BECAUSE ITS AN INSTANCE FIELD.
        System.out.println(NO_OF_LEGS);
    }
}
class Child extends Parent{
    public static void main(String[] args) {
        System.out.println("From Child "+NO_OF_LEGS);
    }
    void printHairColor(){
        System.out.println("black from Child");
    }
}


