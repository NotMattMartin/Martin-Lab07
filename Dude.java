
/**
 * Write a description of class Dude here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.applet.*;

public class Dude extends Applet
{
    public static void drawLegs(Graphics g)
    {
        Expo.setColor(g,Expo.black);
        Expo.drawLine(g,500,700,300,1000);
        Expo.drawLine(g,500,700,700,1000);
    }   
    
    public static void drawChestArms(Graphics g)
    {
        Expo.setColor(g,Expo.black);
        Expo.drawLine(g,500,700,500,400);
        Expo.drawLine(g,500,500,700,600);
        Expo.drawLine(g,500,500,700,650);
    }
    
    public static void drawHead(Graphics g)
    {
        Expo.setColor(g,Expo.black);
        Expo.fillCircle(g,500,250,150);
    }
}
