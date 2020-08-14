package entity;

public enum Species11 {
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
