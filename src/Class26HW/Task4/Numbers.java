package Class26HW.Task4;

import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {


    ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1; i<50; i++){
        if(i%2==0){
            if(i%5!=0){
                numbers.add(i);
            }
        }
    }
        System.out.println(numbers);
  }
}
