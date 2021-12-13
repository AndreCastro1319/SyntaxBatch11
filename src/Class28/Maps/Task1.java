package Class28.Maps;

import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {
        //Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
        // Insert 7 entries with duplicate keys and values.
        //Check how many entries you have?
        //Update company on a 4th floor
        //Remove company on the 7th floor
        //Print your map

        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Apple");
        building.put(4,"Tesla");
        building.put(5,"Amazon");
        building.put(5,"Apple");
        building.put(6,"Syntax");
        building.put(7,"Reddit");
        System.out.println(building);
        System.out.println(building.size());
        System.out.println("- - - - - -  - -");
        System.out.println(building.replace(4,"BABA"));
        System.out.println(building);
        System.out.println("- - - - - - - - - - - ");
        System.out.println(building.remove(7,"Reddit"));
        System.out.println(building);

    }
}
