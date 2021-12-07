package Class26HW.part2Task2;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {
        Card visa=new Visa("Visa");
        Card amex=new Amex("Amex");
        Card discover=new Discover("Discover");


        LinkedList<Card> cards=new LinkedList<>();
        cards.add(visa);
        cards.add(amex);
        cards.add(discover);
        for (Card card:cards){
            card.color();
            card.limit();
        }


    }
}
