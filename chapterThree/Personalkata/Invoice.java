package Personalkata;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }else {
            System.out.println ("the quantity is invalid!!!" );
            quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double itemPrice) {
        if (itemPrice < 0){
            System.out.println ("this Transaction is invalid" );
            itemPrice = 0.0;
        }else if (itemPrice > 0){
            System.out.println ("this Transaction is valid" );
        }
        this.pricePerItem = itemPrice;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getTotalInvoiceAmount(){
       double invoiceAmount = pricePerItem * quantity;

        return invoiceAmount;
    }





}
