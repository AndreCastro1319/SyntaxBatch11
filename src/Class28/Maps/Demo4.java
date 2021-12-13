package Class28.Maps;

import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<String,Double> groceries=new TreeMap<>();
        groceries.put("Eggs",3.99);
        groceries.put("Tomato",3.2);
        groceries.put("Potato",10.0); //Auto conversion does not work in wrapper classes
        groceries.put("Milk",5.0);
        groceries.put("Steak",5.0);

        TreeMap<String,Double> groceries2=new TreeMap<>();
        groceries2.put("Soap",20.0);
        groceries2.put("Shampoo",13.0);
        groceries2.put("beer",2.0);

        TreeMap<String,Double> groceriesList=new TreeMap<>();
        groceriesList.putAll(groceries);
        groceriesList.putAll(groceries2);
        System.out.println(groceriesList);
    }
}
