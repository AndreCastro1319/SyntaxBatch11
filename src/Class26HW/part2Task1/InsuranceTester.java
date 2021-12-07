package Class26HW.part2Task1;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {
        Insurance car=new Car();
        car.getQuote();
        car.cancelInsurance();

        Insurance pet=new Pet();
        pet.getQuote();
        pet.cancelInsurance();

        Insurance health=new Health();
        health.getQuote();
        health.cancelInsurance();
        System.out.println("- - - - -  - - - - - - - - - - -");
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(car);
        insurances.add(pet);
        insurances.add(health);
        for(Insurance insurance:insurances){
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }
}
