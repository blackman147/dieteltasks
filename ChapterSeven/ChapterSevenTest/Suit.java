package ChapterSevenTest;

public enum Suit {
    DIAMOND, HEARTS, CLUBS, SPADES;


    @Override
    public String toString() {
        return switch (this){
            case CLUBS -> "Clubs";
            case HEARTS -> "Hearts";
            case SPADES -> "Spades";
            case DIAMOND -> "Diamond";
        };
    }
}
