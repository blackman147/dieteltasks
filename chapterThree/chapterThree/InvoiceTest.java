package chapterThree;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("b39872",  "radiator",  12, 16000.0 );

        System.out.println("The part Number is: " + invoice.getPartNumber());

        System.out.println("The part is: " + invoice.getPartDescription());
        System.out.println("The quantity of the Item is: " + invoice.getItemQuantity());
        invoice.setItemPrice(22000);
        System.out.println("The price of the item is: " + invoice.getItemPrice());

    }
}
