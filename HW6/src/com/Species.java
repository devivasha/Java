package com;

public enum Species {
    DOG,
    CAT,
    FISH,
    ;

    @Override
    public String toString() {
        return "Species is " + this.name().toLowerCase();
    }
}
