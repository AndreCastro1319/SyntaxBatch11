package Class25.collectionFrame;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {


        String name = "Jimmy";
        String name2 = "Ahmet";
        String[] names3 = {"Maryum", "Ahmet"};

       // Arraylist<String> nameList=new ArrayList<>();


        ArrayList listOfNames= new ArrayList();
        System.out.println("Size of listofnames "+listOfNames.size());
        listOfNames.add("Jimmy");
        listOfNames.add("Jimmy");
        listOfNames.add("Jimmy");
        System.out.println("Size of listofnames "+listOfNames.size());

    }

}