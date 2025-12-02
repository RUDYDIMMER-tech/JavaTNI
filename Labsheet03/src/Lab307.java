import javax.swing.*;
import java.text.DecimalFormat;

public class Lab307 {
    public static void main(String[] args) {
        double sum  = 0;
        double price = 1;

        while (price != 0) {
            price = Double.parseDouble(JOptionPane.showInputDialog("Input price [press 0 to stop]:"));
            while (price < 0 )
                price = Double.parseDouble(JOptionPane.showInputDialog("Invalid price!! \nInput price [press 0 tp stop]:"));
            sum += price ;

        }

        DecimalFormat df = new DecimalFormat("#,##0.0");

        JOptionPane.showMessageDialog(null,"Total price is " + df.format(sum) + "baht.");
    }
}
