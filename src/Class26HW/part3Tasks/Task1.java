package Class26HW.part3Tasks;

import java.util.ArrayList;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        //How can you remove all duplicates from ArrayList?
        ArrayList<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        HashSet<String> set = new HashSet<>(aList);
        set.addAll(aList);
        System.out.println(set);
    }
}
