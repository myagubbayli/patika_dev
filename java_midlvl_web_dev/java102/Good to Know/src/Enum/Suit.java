package Enum;

public enum Suit {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),    
    SPADES("S");

    private final String abbreviation;

    private Suit(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}