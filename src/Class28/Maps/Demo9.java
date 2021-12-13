package Class28.Maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo9 {
    public static void main(String[] args) {

            LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
            grocery.put("egg",5.5);
            grocery.put("rice",4.5);
            grocery.put("milk",4.3);
            grocery.put("tomato",4.3);
            System.out.println(grocery);

        Iterator<Map.Entry<String,Double>> iterator=grocery.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Double> entry= iterator.next();
            if(entry.getKey().equals("milk") && entry.getValue()==4.3 ){
                iterator.remove();
            }
        }

        }
}
