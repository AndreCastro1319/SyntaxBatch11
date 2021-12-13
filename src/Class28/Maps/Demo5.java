package Class28.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new HashMap<>();
        grocery.put("egg",5.5);
        grocery.put("rice",4.5);
        grocery.put("milk",4.3);
        grocery.put("tomato",6.5);



        //for ( String  key: grocery.keySet() ) {
          //  System.out.println( key );

        Collection<String> key = grocery.keySet();
        System.out.println(key);
        Collection<Double> values= grocery.values();
        System.out.println(values);

    }
}
