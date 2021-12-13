package Class26HW.part3Tasks;

import java.util.*;

public class differentway3 {
    public static void main(String[] args) {
       Set<String> cities=new LinkedHashSet<String>();
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
