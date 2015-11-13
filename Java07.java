// Lab07Bst.java
// The OOP Graphics Program
// This is the student, starting file for Lab 07B.
// This is an "Open-Ended" asignment.


import java.awt.*;
import java.applet.*;

//IDEA DRAW A ZILLION RANDOM DUDES
public class Java07 extends Applet
{
    public void paint(Graphics g)
    {
        Background.drawBG(g);
        Background.drawWall(g);
        Dude.drawLegs(g);
        Dude.drawChestArms(g);
        Dude.drawHead(g);
        LaserWeaponThatsNotGun.drawLaserButt(g);
        LaserWeaponThatsNotGun.drawLaserStock(g);
        Lazars.drawLazars(g);
    }
}