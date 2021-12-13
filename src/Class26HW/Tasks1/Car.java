package Class26HW.Tasks1;

import java.util.ArrayList;
import java.util.Iterator;

public class Car {
    //Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Ferrari");
        cars.add("Mercedes");
       // cars.add(1,"Toyota"); will be added to index #1
        System.out.println(cars);

        System.out.println("- - - - - - - - - -  -");

        for(int i=0; i<cars.size();i++) {
            System.out.println(cars.get(i));
            //length() method is for string  arrays/ size() method for lists
        }
            System.out.println("- - - - - - - - - - - ");

        for(String car:cars){
            System.out.println(car);
        }

        System.out.println("- - - - - - - - - -  - - - -");
         int i=0;
         while(i< cars.size()){
             System.out.println(cars.get(i));
             i++;
         }
        System.out.println("- - - - - - - -  - - - - - - - -");
        Iterator<String> iterator=cars.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
        System.out.println("- - - - - - - - - - - - - - - - -");
         cars.stream().spliterator().forEachRemaining(System.out::println);


        }



    }

