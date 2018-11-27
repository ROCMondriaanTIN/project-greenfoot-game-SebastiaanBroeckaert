import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BonusDrie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BonusDrie extends World
{
    int tijd = 0;
    /**
     * Constructor for objects of class BonusDrie.
     * 
     */
    public BonusDrie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("bonus 3.png");
    }
    public void act()
    {
        tijd ++;
        if(tijd >= 10 && Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new BonusVier());
        }
    }
}
