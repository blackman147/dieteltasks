package ChapterFive;

import java.util.Scanner;

public class FairTax {
    private int userSelection;
    int optionSelected = 0;
    private double expense;
    private double totalExpense;
    private double tax;

    public String displayReport() {
        return """
                Enter the following to fill your expense report
                1. Housing
                2. Clothing
                3. Food
                4. Clothing 
                5. Transportation
                6. Education
                7. Health care
                8. Vacations
                """;
    }

    public void optionSelected(int option) {
        userSelection = option;
    }

    public int getSelectedOption() {
        return userSelection;
    }

    public void expenseForSelectedOption(int option) {

        switch (userSelection){
            case 1:
                optionSelected = 1;
                break;
            case 2:
                optionSelected = 2;
                break;
            case 3:
                optionSelected = 3;
                break;
            case 4:
                optionSelected = 4;
                break;
            case 5:
                optionSelected = 5 ;
                break;
            case 6:
                optionSelected = 6;
                break;
            case 7:
                optionSelected = 7;
            case 8:
                optionSelected = 8;
                break;
            default:
                System.out.println("invalid selection");

        }
    }

    public double getExpense() {
        if (optionSelected == 1){
            expense = 3500.0;
        }else if(optionSelected == 2){
            expense = 20.35;
        }else if (optionSelected == 3){
            expense = 10.50;
        }else if (optionSelected == 4){
            expense = 150.76;
        }else if (optionSelected == 5){
            expense = 35.0;
        }else if ( optionSelected == 6){
            expense = 1000.00;
        }else if (optionSelected == 7){
            expense = 567.35;
        }else if (optionSelected == 8){
            expense = 5000.00;
        }
        return expense;
    }

    public void setTotalExpense() {
        if (expense > 0){
            totalExpense += expense;
        }
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void calculateTax() {
        double rate = 0.30;
        tax = rate * totalExpense;
    }

    public double getCalculatedTax() {
        return tax;
    }


}
