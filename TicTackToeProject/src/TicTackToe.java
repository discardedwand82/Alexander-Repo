/*
Alexander Abrams

CSC 200

Tanes Kanchanawanchai
 */

import java.awt.Graphics;
import javax.swing.JApplet;

public class TicTackToe extends JApplet {

    public void paint(Graphics canvas){

        //Circles First Row
        canvas.drawOval(110,60,45,45);
        canvas.drawOval(160,60,45,45);
        canvas.drawOval(210,60,45,45);

        //Circles Second Row
        canvas.drawOval(110,110,45,45);
        canvas.drawOval(160,110,45,45);
        canvas.drawOval(210,110,45,45);

        //Third Row X's
        canvas.drawLine(110, 170, 140, 200);
        canvas.drawLine(140, 170, 110, 200);

        canvas.drawLine(170, 170, 200, 200);
        canvas.drawLine(200, 170, 170, 200);

        canvas.drawLine(220, 170, 250, 200);
        canvas.drawLine(250, 170, 220, 200);

        //Vertical Lines
        canvas.drawLine(157, 50, 157, 210);
        canvas.drawLine(207, 50, 207, 210);

        //Horizontal Lines
        canvas.drawLine(105, 107, 260, 107);
        canvas.drawLine(105, 157, 260, 157);

        //Strike Line
        canvas.drawLine(110, 185, 250, 185);

    }

}
