package Class28.Maps;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        HashMap<String,Integer> fruit=new HashMap<String,Integer>();
        fruit.put("Apple",10);
        fruit.put("Mango",15);
        fruit.put("Orange",20);
        fruit.put("Kiwi",18);
        fruit.put("Apricot",50);
        System.out.println(fruit.get("Kiwi"));
        System.out.println("- - - - - - -  - - -");
        System.out.println(fruit.remove("Orange"));
        System.out.println("- - - - - - - - - - - ");
        System.out.println(fruit);
        System.out.println("- - - - - - - - - - ");
        System.out.println(fruit.containsKey("cow"));
        System.out.println("- - - - - - - - - -");
        System.out.println(fruit.containsKey("Mango"));
        System.out.println("- - - - - - - - - -");
        System.out.println(fruit.keySet());
        System.out.println("- - -  - - - - - ");
        System.out.println(fruit.replace("Mango",35));
        System.out.println(fruit);
    }
}
