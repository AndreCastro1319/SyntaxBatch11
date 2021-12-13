package Class28HW;

import java.util.Collection;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        //Create the collection that will store single uniques Objects of a String type in which order is preserved.
        //Write a logic to concatenate all string from the collection.

        Collection<String> objects=new LinkedList<>();
        objects.add("Monitor");
        objects.add("Keyboard");
        objects.add("Mouse");
        objects.add("Desk");

        String s="";
        for(String object:objects){
            s=s+object;}
       System.out.println(s);

        System.out.println("- - - - -  - - - - -- - - - ");

        for(String object:objects){
            System.out.print(object);
        }
    }
}
