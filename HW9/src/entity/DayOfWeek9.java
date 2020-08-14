package entity;

public enum DayOfWeek9 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SUNDAY,
    SATURDAY,
    ;

    @Override
    public String toString() {
        return "Day of Week is " + this.name().toLowerCase();
    }
}
