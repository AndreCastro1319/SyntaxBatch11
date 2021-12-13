package Class26HW.Task3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Drinks {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Margarita");
        arrayList.add("Sex on the beach");
        arrayList.add("Screwdriver");
        arrayList.add("Mojito");
        arrayList.add("Cuba libre");
        for (int i = 0; i < arrayList.size(); i++) {

            if(arrayList.get(i).toLowerCase().replaceAll("[ae]","").length()< arrayList.get(i).length()){
                arrayList.set(i,"Water");
            }
        }
        System.out.println(arrayList);

        System.out.println("- - - - - - - - - - -  - - - - - -");

       for (int i=0; i< arrayList.size();i++){
           if (arrayList.get(i).contains("a") || arrayList.get(i).contains("e")) {
               arrayList.set(i,"water");

           }
       }
        System.out.println(arrayList);
    }

}



