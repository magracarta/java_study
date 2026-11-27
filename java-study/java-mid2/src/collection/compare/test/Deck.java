package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCards();
        shuffle();
    }

    public Card drawCard() {
        return cards.removeFirst();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void initCards() {
        for (int i=1;i<=13;i++) {
            Suit[] values = Suit.values();
            for (Suit suit : values) {
                 cards.add(new Card(i,suit));
            }
        }
    }


}
