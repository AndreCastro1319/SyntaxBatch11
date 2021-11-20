package Class19.Test;

public class Task2 {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    static void sum( int num1, int num2){

        System.out.println(num1+num2);
    }
     static void sum( int num1, double num2) {
        System.out.println(num1 + num2);
    }
    static void sum( int num1, int num2,int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public static void main(String[] args) {
        Task2.sum(5,5);
        Task2.sum(5,5,5);
        Task2.sum(5,10.5);
    }
}
