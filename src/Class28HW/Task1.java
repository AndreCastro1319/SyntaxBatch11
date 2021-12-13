package Class28HW;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Ecuador", "Quito");
        countries.put("Peru", "Lima");
        countries.put("Bolivia", "La Paz");
        countries.put("Colombia", "Bogota");
        countries.put("Argentina", "Buenos Aires");

        Set<Map.Entry<String, String>> entrySet = countries.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
            System.out.println("- - - - - - - - - - - - - - -");

            Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> country = iterator.next();
                System.out.println(country.getKey() + " " + country.getValue());
            }

            System.out.println("- - - - - - - - - - - - - - - ");

        Collection<String> values= countries.values();
            for(String value:values){
                System.out.println(value);
            }

            System.out.println("- - - - - - - - - - - - - - - - ");

            Iterator<String> iterator1= values.iterator();
            while(iterator1.hasNext()){
                String value= iterator1.next();
                System.out.println(value);
            }
        }
    }
