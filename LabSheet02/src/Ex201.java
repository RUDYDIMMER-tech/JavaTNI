import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {
        String code = "PB-001";
        String name = "Pencil Box";
        int item = 112;
        double price_peritem = 30.20;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        System.out.println("Product name: "+ name +" ("+ code +")");
        System.out.println("Product item: " + item + "(" + price_peritem + "baht/price");

        double total_price = item * price_peritem;
        System.out.println("Total price : " + total_price + "baht");
    }
}
