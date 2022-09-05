package com.tarea6;

import com.tarea6.Card;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.mixCards();
        myDeck.mixCards().stream().forEach(System.out::println);
    }
}