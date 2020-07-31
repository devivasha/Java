public enum Species7 {
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
