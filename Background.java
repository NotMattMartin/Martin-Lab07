
/**
 * Write a description of class Dude here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.applet.*;

public class Background extends Applet
{
    public static void drawBG(Graphics g)
    {
        Expo.setColor(g,Expo.grey);
        Expo.fillRectangle(g,0,0,1920,1080);
    }
    
    public static void drawWall(Graphics g)
    {
        Expo.setColor(g,64,64,64);
        Expo.fillRectangle(g,0,0,200,1080);
        Expo.fillRectangle(g,200,0,800,75);
        Expo.fillRectangle(g,800,0,1920,1080);
    }
}
