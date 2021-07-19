package ChapterFive;

import java.util.Scanner;

public class CalculatingSales {
    private double product ;
    private double price;
    private int quantity;

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price > 0 ) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
    }

    public double product(){
        product = quantity * price;
        return product;
    }




    public static void main(String[] args) {
        CalculatingSales calculate = new CalculatingSales ();
        double product = 0;

        String message = """
                Enter a number between 1 and 5 to select a product or select 0 to exit:
                product 1: $ 2.98.
                product 2: $ 4.50.
                product 3: $ 9.98.
                product 4: $ 4.49.
                product 5: $ 6.87.
                """;
        System.out.println (message );
        Scanner scan = new Scanner (System.in);
        int productNumber = scan.nextInt ();

        while (productNumber != 0){
            System.out.println ("how many quantity of this " + productNumber + "do you want");
            int productQuantity = scan.nextInt ();
            switch (productNumber){
                case 1:
                    calculate.setPrice (2.98);
                    calculate.setQuantity (productQuantity);
                    product = calculate.product;
                    break;
                case 2:
                    calculate.setPrice (4.50);
                    calculate.setQuantity (productQuantity);
                    product = calculate.product;
                    break;
                case 3:
                    calculate.setPrice (9.98);
                    calculate.setQuantity (productQuantity);
                    product = calculate.product;
                    break;
                case 4:
                    calculate.setPrice (4.49);
                    calculate.setQuantity (productQuantity);
                    product = calculate.product;
                    break;
                case 5:
                    calculate.setPrice (6.87);
                    calculate.setQuantity (productQuantity);
                    product = calculate.product;
                default:
                    System.out.println ("invalid product number!!!" );
            }
            System.out.println ( );
            System.out.println (message );
            productNumber = scan.nextInt ();
        }

        System.out.println ("The total amount of product selected  is: " + product );





    }
}
