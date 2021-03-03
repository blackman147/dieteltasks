package chapterThree;

public class Invoice {


        private String partNumber;

        private String partDescription;

        private int itemQuantity;

        private double itemPrice;



        public Invoice(String partNumber , String partDescription, int itemQuantity, double itemPrice){
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.itemQuantity = itemQuantity;
            this.itemPrice = itemPrice;

        }

        public  void setPartNumber(String partNumber){
            this.partNumber = partNumber;
        }
        public String getPartNumber(){
            return partNumber;
        }

        public void setPartDescription(String partDescription){
            this.partDescription = partDescription;
        }

        public String getPartDescription(){
            return partDescription;
        }

        public void setItemQuantity(int itemQuantity){
            this.itemQuantity = itemQuantity;
        }

        public int getItemQuantity(){
            return itemQuantity;
        }

        public void setItemPrice(double itemPrice){
            if ( itemPrice < 0){
                System.out.println("this is invalid ");
                itemPrice = 0.0;
            }
            else if (itemPrice > 0){
                System.out.println("This transaction is valid ");

            }
            this.itemPrice = itemPrice;


        }

        public double getItemPrice(){
            return itemPrice;
        }


    }


