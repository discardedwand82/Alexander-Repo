

import javax.swing.*;
import java.awt.*;

public class ConversionProject{

    public static void main(String[] args){
        int sWidth;
        int sHeight;


        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension= toolkit.getScreenSize();
        sWidth = (int)dimension.getWidth();
        sHeight= (int)dimension.getHeight();
        JOptionPane pane = new JOptionPane();
        JDialog dialog;

        dialog = pane.createDialog("Conversion Program");


        String cm = JOptionPane.showInputDialog("Enter your height in cm");
        double centi = Integer.parseInt(cm);

        double totalinches = centi/2.54;
        double feet = java.lang.Math.floor(totalinches/12);
        double inches = totalinches-feet*12;
        inches = java.lang.Math.round(inches);

        if(inches == 12.0){
            feet = feet+1;
            inches = 0;
        }




        JOptionPane.showMessageDialog(null, "Your height in inches is: "+feet +"\"" +inches +"\'");

        System.exit(0);

    }

}
