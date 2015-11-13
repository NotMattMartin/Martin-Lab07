
/**
 * Write a description of class Dude here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.applet.*;

public class Lazars extends Applet
{
    public static void drawLazars(Graphics g)
    {
        for (int count = 1; count <= 1000; count++)
        {
            Expo.setRandomColor(g);
            Expo.delay(1);
            int x = 900;
            int y = 595;
            int q = Expo.random(1800,1920);
            int z = Expo.random(395,795);
            Expo.drawLine(g,x,y,q,z);
        }
    }
}
