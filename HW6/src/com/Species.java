package com;

public enum Species {
    DOG,
    FISH,
    ROBOCAT,
    DOMESTICCAT,
    UNKNOWN ;

    @Override
    public String toString() {
        return "Species is " + this.name().toLowerCase();
    }
}
