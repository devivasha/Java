package entity;

public enum Species12 {
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
