public enum GuitarString {
    FIVE(5),
    SIX(6),
    SEVEN(7),
    TWELVE(12);

    private final int value;

    GuitarString(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}