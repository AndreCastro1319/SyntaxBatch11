package Class26.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("Apple");
        System.out.println(hashSet);

        System.out.println("- - - - -  - - - -  -");

       ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Mango");
        arrayList.add("Kiwi");
        arrayList.add("Apple");
        arrayList.add("Apple");
        System.out.println(arrayList);

        System.out.println("- - - - - - - - - ");

        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Mango");
        linkedList.add("Kiwi");
        linkedList.add("Apple");
        linkedList.add("Apple");
        System.out.println(linkedList);
    }
}
