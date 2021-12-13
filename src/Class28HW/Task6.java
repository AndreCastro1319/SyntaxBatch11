package Class28HW;

import java.util.Collection;
import java.util.LinkedList;

public class Task6 {
    public static void main(String[] args) {
        //Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers

        Collection<Integer> numbers=new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);

        int sum=0;
        for(Integer number:numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}
