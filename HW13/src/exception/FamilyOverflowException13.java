package exception;

public class FamilyOverflowException13 extends RuntimeException {
    private int familiesCount;

    public FamilyOverflowException13(int familiesCount) {
        super("Exceeding the number of family members: " + familiesCount);
        this.familiesCount = familiesCount;
    }

    public FamilyOverflowException13(String message, int familiesCount) {
        super(message);
        this.familiesCount = familiesCount;
    }

    public int getFamilyCount() {
        return familiesCount;
    }

}
