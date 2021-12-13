package Class28HW;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        //Create a Map that will store Employee name and salary.
        //Write a logic to retrieve an employee who gets the highest salary.
        //Output should be in the below format
        //John Smith=$100000

        HashMap<String,Integer> salary=new HashMap<>();
        salary.put("John Smith",100000);
        salary.put("Jimmy Smith",200000);
        salary.put("Seba Smith",300000);
        salary.put("Mateo Smith",400000);

       Iterator<Integer> iterator=salary.values().iterator();
        int highvalue=0;
       while(iterator.hasNext()) {
           Integer salary1 = iterator.next();
           if (salary1 > highvalue) {
               highvalue = salary1;
           }
       }
        Set<Map.Entry<String,Integer>> entrySet=salary.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            if(entry.getValue()==highvalue){
                System.out.println(entry.getKey()+" = $"+entry.getValue());
            }



        }



    }
}
