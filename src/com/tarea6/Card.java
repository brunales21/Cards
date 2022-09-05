package com.tarea6;

public class Card {
    private final int number;
    private final CardType cardType;

    public Card(int number, CardType cardType) {
        this.number = number;
        this.cardType = cardType;
    }

    public int getNumber() {
        return this.number;
    }

    public CardType getType() {
        return this.cardType;
    }

    public String toString() {
        return String.format("%s[type: %s, number: %s]", getClass().getSimpleName(), cardType, number);
    }

}
