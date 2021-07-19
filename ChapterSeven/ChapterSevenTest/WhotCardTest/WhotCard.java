package ChapterSevenTest.WhotCardTest;

import CardGameException.InvalidCardException;

import static ChapterSevenTest.WhotCardTest.WhotSuit.*;

public class WhotCard {
    private final int value;
    private final WhotSuit whotSuit;
    public WhotCard(WhotSuit whotSuit, int value) {
//        if (value < 1 || value > 14){
//            throw new InvalidCardException (value + "is not a valid card value");
//        }
        this.value = value;
        this.whotSuit = whotSuit;
    }

    public WhotSuit getWhotSuit() {
        return whotSuit;
    }

    public String getValue() {
        return switch (this.value) {
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 7 -> "7";
            case 8 -> "8";
            case 10 -> "10";
            case 11 -> "11";
            case 12 -> "12";
            case 13 -> "13";
            case 14 -> "14";
            case 20 -> "20";
            default -> "invalid Card Number";
        };
    }

    public static WhotCard creatingATriangleCard(int value){
        WhotCard triangle = new WhotCard (TRIANGLE, value);
        return triangle;
    }

    public static WhotCard creatingACircleCard(int value){
        WhotCard circle = new WhotCard (CIRCLE, value);
        return circle;
    }

    public static WhotCard creatingAStarCard(int value){
        WhotCard star = new WhotCard (STAR, value);
        return star;
    }

    public static WhotCard creatingASquareCard(int value){
        WhotCard square = new WhotCard (SQUARE, value);
        return square;
    }

    public static WhotCard creatingACrosseCard(int value){
        WhotCard cross = new WhotCard (CROSS, value);
        return cross;
    }
    public static WhotCard creatingAWhotCard(int value){
        WhotCard whot = new WhotCard (WHOT, value);
        return whot;
    }

}
