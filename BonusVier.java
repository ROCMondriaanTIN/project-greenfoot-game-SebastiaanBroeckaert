import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BonusVier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BonusVier extends World
{
    int tijd = 0;
    /**
     * Constructor for objects of class BonusVier.
     * 
     */
    public BonusVier()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("bonus 4.png");
    }
    public void act()
    {
        tijd ++;
        if(tijd >= 10 && Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Startscherm());
        }
    }
}
