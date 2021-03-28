package chapterFour;

public class SalesCommissions {
    private double price;
    private double totalAdditionOfPrice;
    private double salary = 200.00;


    public void setPrice( double price) {
        if (price > 0){
            this.price = price;
            totalAdditionOfPrice += price;
        }
    }

    public double getPrice() {
        return price;
    }

    public double getTotalAdditionOfPrice() {
        return totalAdditionOfPrice;
    }


    public double calculateNinePercentOfTotalPrice() {
        return (9.0 / 100) * totalAdditionOfPrice;
    }

    public void setSalaryForTheMonth(double salary) {
        this.salary = salary;
    }

    public double getSalaryForTheMonth() {
        return salary;
    }

    public double calculateTotalSalaryForTheMonth() {
        return salary + ((9.0 / 100) * totalAdditionOfPrice);
    }
}
