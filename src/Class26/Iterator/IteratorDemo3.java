package Class26.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo3 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("SDLC");
        subjects.add("Manual Testing");
        Iterator<String> iterator1=subjects.iterator();

        System.out.println(iterator1.hasNext());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        iterator1.remove();

        System.out.println(subjects);
    }
}
