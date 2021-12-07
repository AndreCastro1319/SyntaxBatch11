package Class26HW.part3Tasks;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        //Create a Set collection in which you need to add names of the countries.
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.

        TreeSet<String> countries=new TreeSet<>();
        countries.add("Ecuador");
        countries.add("USA");
        countries.add("France");
        countries.add("Germany");
        countries.add("Brazil");
        System.out.println(countries);

        System.out.println("- - - - - - - - - - - - - - - -");

        for(String country:countries){
            System.out.println(country);
        }
        System.out.println("- - - - - - - - - - - - - - - - - - ");

        TreeSet<String> set=new TreeSet<>();
        set.addAll(countries);
        System.out.println(set);

    }
}
