package com.tarea6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public Deck() {
        initDeck();
    }
    private void initDeck() {
        for (int type = 0; type<4; type++) {
            for (int number = 1; number<=12; number++) {
                Card card = new Card(number, CardType.values()[type]);
                deck.add(card);
            }
        }
    }

    public List<Card> getDeck() {
        return deck;
    }

    public List<Card> mixCards() {
        return deck = mixCards(deck);
    }

    public List<Card> mixCards(List<Card> deck) {
        Random rnd = new Random();
        List<Card> mixedDeck = new ArrayList<>();
        while(!deck.isEmpty()) {
            mixedDeck.add(deck.remove(rnd.nextInt(deck.size())));
        }
        return mixedDeck;
    }


}
