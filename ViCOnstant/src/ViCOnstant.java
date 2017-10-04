
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class ViCOnstant{

    public static void main(String args[]){
        int width, height;


        final double quarter = .25;
        final double dime = .10;
        final double nickel = .05;
        final double penny = .01;

        DecimalFormat formatter = new DecimalFormat("#0.00");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        width = (int)dimension.getWidth();
        height = (int)dimension.getHeight();
        JOptionPane pane = new JOptionPane();
        JDialog dialog;

        dialog = pane.createDialog("Vi Constant");

        String money = JOptionPane.showInputDialog("Enter the amount of money here(ex: 4.95)");
        double amount = Double.parseDouble(money);

        double tQuarter = (amount/quarter);
        amount %= quarter;

        double tDime = (amount/dime);
        amount %= dime;

        double tNickel = (amount/nickel);
        amount %= nickel;

        double tPenny = (amount/penny);
        amount %= penny;

        JOptionPane.showMessageDialog(null, "Your amount in Quarters is: "+tQuarter +"\nYour amount in Dimes is: " +tDime +
                "\nYour amount in Nickels is: " +tNickel +"\nYour amount in Pennies is "+tPenny);
    }

}
