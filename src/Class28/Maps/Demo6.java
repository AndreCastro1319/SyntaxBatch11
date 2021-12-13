package Class28.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo6 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",4.3);
        grocery.put("tomato",6.5);
        System.out.println(grocery);

        Iterator<String> iterator=grocery.keySet().iterator();
        while(iterator.hasNext()){
            String key= iterator.next();
            if(key.contains("e")){
                iterator.remove();
            }
        }
        System.out.println(grocery);
    }
}
