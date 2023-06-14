package com.kata.kataforfun.models;

public enum Divisor {
    THREE('3', "Kata"),
    FIVE('5', "For"),
    SEVEN('7', "Fun");

    private char character;
    private String value;

    Divisor(char character, String value) {
        this.character = character;
        this.value = value;
    }

    public char getCharacter() {
        return character;
    }

    public String getValue() {
        return value;
    }
}
