import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startscherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscherm extends World
{
    /**
     * Constructor for objects of class startscherm.
     * 
     */
    public Startscherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        Greenfoot.start();
        
        prepare();
    }
    
    /**
     * Maakt de startscherm mooi.
     */
    private void prepare()
    {
        StartschermAfbeelding startscherm = new StartschermAfbeelding();
        addObject(startscherm, 500, 400);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Instructie());
        }
    }
}
