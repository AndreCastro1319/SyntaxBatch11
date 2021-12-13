package Class28HW;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.

        TreeMap<Integer, String> bestbuy = new TreeMap<>();
        bestbuy.put(12345, "Tv");
        bestbuy.put(46987, "Washer");
        bestbuy.put(14725, "Refrigerator");
        bestbuy.put(36985, "PlayStation5");

        Set<Map.Entry<Integer, String>> entrySet = bestbuy.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
