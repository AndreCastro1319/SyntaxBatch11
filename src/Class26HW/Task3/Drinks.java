package Class26HW.Task3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Drinks {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drink = new ArrayList<>();
        drink.add("Margarita");
        drink.add("Sex on the beach");
        drink.add("Screwdriver");
        drink.add("Mojito");
        drink.add("Cuba libre");


       for (int i=0; i< drink.size();i++){
           if (drink.get(i).contains("a") || drink.get(i).contains("e")) {
               drink.remove(drink.get(i));
               drink.add(i,"water");

           }
       }
        System.out.println(drink);
    }
}



