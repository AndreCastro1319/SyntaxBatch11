package Class26HW.Tasks1;

import java.util.ArrayList;

public class Car {
    //Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Mercedes");
        System.out.println(cars);

        System.out.println("- - - - - - - - - -  -");

        for(int i=0; i<cars.size();i++) {
            System.out.println(cars.get(i));
        }
            System.out.println("- - - - - - - - - - - ");

        for(String car:cars){
            System.out.println(car);
        }
        }



    }

