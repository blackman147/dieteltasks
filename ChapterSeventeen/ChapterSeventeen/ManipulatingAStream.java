//package ChapterSeventeen;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class ManipulatingAStream {
//    private int partNumber;
//    private String partDescription;
//    private int quantity;
//    private double price;
//
//    public ManipulatingAStream(int partNumber, String partDescription, int quantity, double price) {
//        this.partNumber = partNumber;
//        this.partDescription = partDescription;
//        this.quantity = quantity;
//        this.price = price;
//    }
//
//    public int getPartNumber() {
//        return partNumber;
//    }
//
//    public void setPartNumber(int partNumber) {
//        this.partNumber = partNumber;
//    }
//
//    public String getPartDescription() {
//        return partDescription;
//    }
//
//    public void setPartDescription(String partDescription) {
//        this.partDescription = partDescription;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//    public double getInvoice (double price, int quantity){
//        return price * quantity;
//    }
//
//
//    @Override
//    public String toString(){
//        return String.format ("%2d %20s %10d %11.2f " , getPartNumber (), getPartDescription (), getQuantity (), getPrice ());
//    }
//
//    public Map<String, List<ManipulatingAStream>>mapByDescription(){
//
//        List<ManipulatingAStream> list = Arrays.asList(parts);
//        Map<String, List<ManipulatingAStream>> mappedbydesc = list.stream ()
//                .sorted (Comparator.comparing (ManipulatingAStream::getQuantity))
//                .collect (Collectors.groupingBy (ManipulatingAStream::getPartDescription))
//    };
//
//
//
//    public static void main(String[] args) {
//
//        ManipulatingAStream [] parts ={ new ManipulatingAStream(83, "Eletric Sander", 7,57.98 ),
//                                        new ManipulatingAStream ( 24,"Power saw " ,18, 99.99),
//                                        new ManipulatingAStream ( 7 ,"Sledge hammer", 11, 21.50),
//                                        new ManipulatingAStream (77, "Hammer ", 76 , 11.99),
//                                        new ManipulatingAStream (39, "Lawn mower" ,3, 79.50),
//                                        new ManipulatingAStream ( 68, "Screwdriver", 106, 6.99),
//                                        new ManipulatingAStream (56, "Jig saw", 21 ,11.00),
//                                        new ManipulatingAStream ( 3, "Wrench ",34, 7.50)};
//
//        List<ManipulatingAStream> list = Arrays.asList(parts);
//        System.out.println ("Sorted by Part Number");
//        System.out.printf ("%2s %5s %6s %7s %n", "Part Number ", "Part Description", "Quantity", "Price");
//        list.stream ()
//                .sorted ( Comparator.comparing (ManipulatingAStream::getPartNumber) )
//                .forEach (System.out::println);
//        System.out.println ( );
//
//
//
//        System.out.println ("Sorted by price");
//        System.out.printf ("%2s %5s %6s %7s %10s %n", "Part Number ", "Part Description", "Quantity", "Price", "Invoice");
//        list.stream ()
//                .sorted ( Comparator.comparing (ManipulatingAStream::getPrice) )
//                .forEach (System.out::println);
//        System.out.println ( );
//
//        System.out.println ("Mapped to Part Description");
//        System.out.printf ("%2s %5s %6s %7s %10s %n", "Part Number ", "Part Description", "Quantity", "Price", "Invoice");
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//}
//
