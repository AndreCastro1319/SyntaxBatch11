package Review;

import java.sql.SQLOutput;

public class StringReview {
    public static void main(String[] args) {
        String str="Today is Thursday it is Java Review";

        boolean empty=str.isEmpty();
        System.out.println("My string is empty ="+empty);

       // str.full(); theres no method
        int length =str.length();
        System.out.println("Length of the string is "+length);

        str.replace("Thursday", "Monday");
       // System.out.println(str);
        System.out.println(str.replace("Thursday","Monday"));

            // how many words my string has?
       String []  allWords=str.split(" ");
        System.out.println("In my string I have " +allWords.length+" words");

        //print all words 1 by 1
        for(String word:allWords){
            System.out.print(word+" ");
        }
        System.out.println();
        //how would you reverse a string?
        String give="Hello";

        StringBuilder sb=new StringBuilder(give);
        sb.reverse();
        System.out.println(sb);

        // how would you reverse a String without using reverse
            String reverse="";
        for(int i=give.length()-1;i>=0;i--){
            reverse+=give.charAt(i);
        }
        System.out.println(reverse);

        //substring
        String s="Today I am happy";
        System.out.println(s.substring(6));
        System.out.println(s.substring(5,10));



        //To define a method we MUST
        // MUST return type
        // MUST name()
        // OPTIONAL non access modifier
        //OPTIONAL access modifier


    }
}
