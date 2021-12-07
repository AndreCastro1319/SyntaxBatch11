package Class26.HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> treeSet=new TreeSet<>();// alphabetical and number order...
        treeSet.add("Z");
        treeSet.add("X");
        treeSet.add("A");
        System.out.println(treeSet);
    }
}
