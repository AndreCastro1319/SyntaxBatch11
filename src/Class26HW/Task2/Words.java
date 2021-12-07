package Class26HW.Task2;

import java.util.ArrayList;

public class Words {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Soccer");
        word.add("Crypto");
        word.add("Turtle");
        word.add("Tacos");

        for (String words : word) {
            if (words.endsWith("e")){
                word.remove(words);
            }
        }
        System.out.println(word);
    }
}