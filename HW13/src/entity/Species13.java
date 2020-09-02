package entity;

public enum Species13 {
    DOG,
    DOMESTICCAT,
    FISH,
    ROBOCAT,
    UNKNOWN
    ;

    @Override
    public String toString() {
        return  this.name().toLowerCase();
    }
}
