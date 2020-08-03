public enum Species8 {
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
