package Personalkata;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice = new Invoice ("2f67p", "hammer", 5, 500);

        System.out.println ("your part number is: " + invoice.getPartNumber () );
        System.out.println ("your part description is: " + invoice.getPartDescription () );
        invoice.setQuantity (10);
        System.out.println ("The quantity of items you have ordered is: " + invoice.getQuantity () );
        System.out.println ("The total amount of items bought is: " + invoice.getTotalInvoiceAmount () );
    }
}
