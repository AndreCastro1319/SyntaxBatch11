package Class26HW.part3Tasks;

import java.util.Iterator;
import java.util.TreeSet;

public class differentWay {
    public static void main(String[] args) {

        TreeSet<String> countries=new TreeSet<>();
        countries.add("Ecuador");
        countries.add("USA");
        countries.add("France");
        countries.add("Germany");
        countries.add("Brazil");
        System.out.println(countries);


        Iterator<String> iterator=countries.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
