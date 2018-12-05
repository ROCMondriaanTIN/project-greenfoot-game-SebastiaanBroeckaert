import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Instructie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructie extends World
{
    int tijd = 0;
    /**
     * Constructor for objects of class Instructie.
     * 
     */
    public Instructie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        this.setBackground("InstructieScherm2.0.png");
    }
    public void act() 
    {
        tijd ++;
        if(tijd >= 10 && Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new SelectLevel());
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new SelectLevel());
        }
    }
}
