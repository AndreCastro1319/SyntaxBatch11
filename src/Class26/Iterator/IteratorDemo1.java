package Class26.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {


        ArrayList<String> subjects1 = new ArrayList<>();

        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        Iterator<String> iterator=subjects1.iterator();
        System.out.println(iterator.hasNext());// tells me if there are any elements left on the iterator
        System.out.println(iterator.next());// goes one by one and moves the pointer one location ahead
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.remove();//keeps track of that pointer
        System.out.println(iterator.next());
        System.out.println(subjects1);
        System.out.println(iterator.hasNext());


    }
}