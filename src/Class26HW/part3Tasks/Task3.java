package Class26HW.part3Tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        // Then remove any city that starts with “A”;

       TreeSet<String> cities=new TreeSet<>();
        cities.add("Alexandria");
        cities.add("Woodbridge");
        cities.add("Annandale");
        cities.add("Springfield");
        System.out.println(cities);

        Iterator<String> iterator=cities.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println(cities);


    }
}
