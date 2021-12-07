package Class25.HW;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that

        ArrayList<String> nameList=new ArrayList<>();
        nameList.add("Jimmy");
        nameList.add("Mateo");
        nameList.add("Sebastian");
        nameList.add("Carolina");
        nameList.add("Teddy");
        System.out.println(nameList.isEmpty());
        System.out.println(nameList.contains("Jimmy"));
        System.out.println(nameList.size());
        System.out.println(nameList);
    }
}
