package Class28.Maps;

import java.util.LinkedHashMap;

public class Demo3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(10,"Alexey");
        students.put(10,"Ahmet");// keys should be unique if we insert the data with same key it will replace old data
        students.put(10,"Alexey");
        students.put(20,"Denis");    //Also keeps the order
        students.put(100,"Henok");
        System.out.println(students);

    }
}
