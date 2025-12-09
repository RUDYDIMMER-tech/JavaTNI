import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your full name: ");
        while (name.trim().indexOf(' ')==-1){
            name = JOptionPane.showInputDialog("Enter your full name: ");
        }

        JOptionPane.showMessageDialog(null,"Welcome, "+name.substring(0,name.indexOf(' '))+" "+name.toUpperCase().substring(name.indexOf(' ')+1));
    }
}
