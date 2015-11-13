
/**
 * Write a description of class Dude here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
import java.applet.*;

public class LaserWeaponThatsNotGun extends Applet
{
    public static void drawLaserButt(Graphics g)
    {
        Expo.setColor(g,Expo.black);
        Expo.fillRectangle(g,700,575,750,675);
    }
    
    public static void drawLaserStock(Graphics g)
    {
        Expo.setColor(g,Expo.white);
        Expo.fillRectangle(g,700,575,900,615);
    }
}
