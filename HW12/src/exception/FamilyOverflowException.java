package exception;

public class FamilyOverflowException extends RuntimeException {
    private int familiesCount;

    public FamilyOverflowException(int familiesCount) {
        super("Exceeding the number of family members: " + familiesCount);
        this.familiesCount = familiesCount;
    }

    public FamilyOverflowException(String message, int familiesCount) {
        super(message);
        this.familiesCount = familiesCount;
    }

    public int getFamilyCount() {
        return familiesCount;
    }

}
