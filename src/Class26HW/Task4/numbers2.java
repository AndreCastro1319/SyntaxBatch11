package Class26HW.Task4;

import java.util.ArrayList;
import java.util.Iterator;

public class numbers2 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        for (int i = 0; i < 50; i=+2) {
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);
        Iterator<Integer> iterator=evenNumbers.iterator();
        while (iterator.hasNext()){
            Integer number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNumbers);
    }
}
